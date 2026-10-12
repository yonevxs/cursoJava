package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Main {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection = DB.getConnection();
			
			/*
			// Método que recebe como argumento uma String que vai receber o comando SQL
			ps = connection.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					// A interrogação é colocada porque será nosso placeholder (aonde vamos inserir os valores depois)
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS); 
			
			// Comandos para trocar a interrogação nos valores que queremos
			ps.setString(1, "Carl Purple");
			ps.setString(2, "carlpurple@gmail.com");
			
			// Quando instanciamos data no JDBC para inserir no PreparedStatement, temos que usar java.sql.Date()
			ps.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			
			ps.setDouble(4, 3000.0);
			ps.setInt(5, 4);
			*/
			
			ps = connection.prepareStatement(
					"INSERT INTO department (Name) VALUES ('D1'), ('D2')", 
					Statement.RETURN_GENERATED_KEYS);
			
			// Executando comando de inserção
			int rowsAffected = ps.executeUpdate(); // Resultado é um número inteiro indicando quantas linhas foram alteradas
			
			if (rowsAffected > 0 ) {
				// Pegando código do novo registro inserido
				ResultSet rs = ps.getGeneratedKeys(); // O método retorna um objeto do tipo ResultSet
				
				while (rs.next()) {
					int id = rs.getInt(1); // Vamos receber uma única tabela auxiliar contendo os IDs
					System.out.println("Done! Id = " + id);
				}
			}
			else {
				System.out.println("No rows affected!");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}
	}
}
