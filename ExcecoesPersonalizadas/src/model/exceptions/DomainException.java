package model.exceptions;

public class DomainException extends Exception{ // Com RuntimeExceptio não somos obrigados a tratar os erros da classe Reservation
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg); // Repassa a variável msg para o construtor da superclasse (Exception)
	}

}
