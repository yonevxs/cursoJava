package model.services;

public interface Notificador {
	void enviar(String msg);
	
	default void notificarComFormatacao(String msg) {
		String msgFormatada = "--- [NOTIFICAÇÃO] --- \n" + msg;
		enviar(msgFormatada);
	}
}
