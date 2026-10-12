package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Main {
	public static void main(String[] args) {
		
		// Conexão com banco
		Connection connection = null;
		
		// Consulta SQL
		Statement st = null;
		
		// Resultado da consulta SQL
		ResultSet rs = null;
		
		try {
			connection = DB.getConnection();
			
			// Instanciação de um objeto do tipo Statement
			st = connection.createStatement();
			
			// Método que você implementa um comando SQL (entra com uma string como parâmetro)
			rs = st.executeQuery("SELECT * FROM department");
			
			// O Resultado da consulta será atribuido no ResultSet rs
			
			while (rs.next()) {
				// Capturando os campos que estão no Banco de Dados - Percorrendo um ResultSet
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
