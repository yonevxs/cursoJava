package db;

public class DBIntegrityException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	// Exceção personalizada de Integridade Referencial
	public DBIntegrityException(String msg) {
		super(msg);
	}
}
