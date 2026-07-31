package model.services;

public class GeradorHtml implements GeradorFormatado{
	
	@Override
	public void gerar(String conteudo) {
		System.out.println("Gerando HTML com contéudo: " + conteudo);
	}
}
