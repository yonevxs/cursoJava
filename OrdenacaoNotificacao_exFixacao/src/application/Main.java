package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Produto;
import model.services.Notificador;
import model.services.NotificadorEmail;
import model.services.ProcessadorProdutos;

public class Main {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Monitor AOC", 1233.90));
		produtos.add(new Produto("Controle 8BitDo", 249.99));
		produtos.add(new Produto("Notebook ASUS Tuf 16", 7599.90));
		
		Notificador emailService = new NotificadorEmail();
		ProcessadorProdutos processador = new ProcessadorProdutos(emailService);
		
		processador.processar(produtos);
		
	}
}
