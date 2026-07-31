package model.services;

public class GeradorPdf implements GeradorFormatado{
	
	@Override
	public void gerar(String conteudo){
		System.out.println("Gerando PDF com conteúdo: " + conteudo);
	}
}
