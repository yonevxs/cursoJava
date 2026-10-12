package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;

import db.DB;
import db.DBException;

public class Main {
	public static void main(String[] args) {
		
		Connection connection = null;
		Statement st = null;
		
		try {
			connection = DB.getConnection();
			
			// Utilizando transação para o programa executar tudo ou nada - Principio ACID (Atomicity)
			connection.setAutoCommit(false); // Não confirma as operações automaticamente, vão ficar pendentes de uma confirmação manual
			st = connection.createStatement();
			
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			connection.commit(); // Confirma as transações
			
			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);
			
		} catch (SQLException e) {
			// Lógica para voltar a transação caso tenha parado no meio
			try {
				connection.rollback();
				throw new DBException("Transaction roller back! Caused by: " + e.getMessage());
			} catch (SQLException e1) { // Caso dê erro no rollback
				throw new DBException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
