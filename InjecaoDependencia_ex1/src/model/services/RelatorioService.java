package model.services;

public class RelatorioService {
	private GeradorFormatado geradorFormatado;
	
	public RelatorioService(GeradorFormatado geradorFormatado) {
		this.geradorFormatado = geradorFormatado;
	}
	
	public void emitir(String texto) {
		geradorFormatado.gerar(texto);
	}
}
