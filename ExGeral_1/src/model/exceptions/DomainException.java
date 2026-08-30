package model.exceptions;

public class DomainException extends RuntimeException{
	private final static long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}
