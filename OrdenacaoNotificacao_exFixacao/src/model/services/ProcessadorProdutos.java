package model.services;

import java.util.Collections;
import java.util.List;

import model.entities.Produto;

public class ProcessadorProdutos {
	private Notificador notificador;
	
	public ProcessadorProdutos(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void processar(List<Produto> produtos) {
		Collections.sort(produtos);
		StringBuilder sb = new StringBuilder("\nProdutos ordernados por preço: \n");
		for(Produto p : produtos) {
			sb.append("- ").append(p.toString()).append("\n");
		}
		
		notificador.notificarComFormatacao(sb.toString());
	}
}
