package model.services;

public class EnvioEmail implements EnvioComprovante{
	
	@Override 
	public void enviar(String msg) {
		System.out.println("Enviando mensagem por email: " + msg);
	}
}
