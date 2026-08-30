package model.services;

public class NotificadorEmail implements Notificador{

	@Override
	public void enviar(String msg) {
		System.out.println("Mensagem a ser enviada via e-mail: \n\n" + msg);
	}
}
