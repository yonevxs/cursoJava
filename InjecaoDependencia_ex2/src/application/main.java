package application;

import model.services.EnvioEmail;
import model.services.FreteFixo;
import model.services.FretePorKm;
import model.services.ProcessadorDeVendas;

public class main {

	public static void main(String[] args) {
		
		FretePorKm fretePorKm = new FretePorKm();
		EnvioEmail envioEmail = new EnvioEmail();
		ProcessadorDeVendas process2 = new ProcessadorDeVendas(fretePorKm, envioEmail);
		process2.finalizarVenda(50.0, 100.0);
		
		ProcessadorDeVendas process = new ProcessadorDeVendas(new FreteFixo(), new EnvioEmail());
		process.finalizarVenda(15.0, 30);
		
		

	}

}
