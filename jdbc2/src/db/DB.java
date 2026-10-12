package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {
	
	// Criando objeto do tipo Connection - Objeto de conexão com o banco de dados JDBC
	private static Connection connection = null;
	
	// Criando métodos estáticos para conectar e desconectar com o banco de dados
	
	// Método auxiliar para carregar as propriedades que estão salvas no arquivo db.properties
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs); // faz a leitura do meu arquivo properties apontado pelo objeto fs e guarda os dados dentro de si (props)
			return props;
		} catch (IOException e) {
			throw new DBException(e.getMessage());
		}
	}
	
	// Método para se conectar com o banco de dados
	public static Connection getConnection() {
		if (connection == null) {
			try{
				// Pegando propriedades de conexão
				Properties props = loadProperties();
				
				String url = props.getProperty("dburl");
				
				// Conexão com o banco de dados
				connection = DriverManager.getConnection(url, props);
			}
			catch (SQLException e) {
				throw new DBException(e.getMessage());
			}
			// Conectar com um banco de dados no JDBC é instanciar um objeto Connection
		}
		return connection;
	}
	
	// Método para fechar a conexão
	public static void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new DBException(e.getMessage());
			}
		}
	}
	
	// Métodos auxiliares para fechar Statement e ResultSet
	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DBException(e.getMessage()); // Teremos um fechamento de Statement usando uma RuntimeException, ou seja, não precisamos ficar tratando com try toda hora
			}
		}
	}
	
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DBException(e.getMessage());
			}
		}
	}
}
