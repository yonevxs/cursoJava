package application;

import model.services.GeradorFormatado;
import model.services.GeradorHtml;
import model.services.GeradorPdf;
import model.services.RelatorioService;

public class main {

	public static void main(String[] args) {
		
		// Criando interdace e dependencia
		GeradorFormatado html  = new GeradorHtml();
		
		// Implementando dependencia
		RelatorioService relatorioHtml = new RelatorioService(html);
		relatorioHtml.emitir("Landing Page de vendas");
		
		// Injetando dependencia no service - Opção mais direta
		RelatorioService relatorioPdf = new RelatorioService(new GeradorPdf());
		relatorioPdf.emitir("Apostila de Inglês");

	}

}
