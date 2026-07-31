package model.services;

public class ProcessadorDeVendas {
	private final CalculadoraFrete calculadoraFrete;
	private final EnvioComprovante envioComprovante;
	
	public ProcessadorDeVendas(CalculadoraFrete calculadoraFrete, EnvioComprovante envioComprovante) {
		this.calculadoraFrete = calculadoraFrete;
		this.envioComprovante = envioComprovante;
	}
	
	public void finalizarVenda(double valorProduto, double distancia) {
		double valorFrete = calculadoraFrete.calcular(distancia);
		double valorTotal = valorProduto + valorFrete;
		
		String msg = String.format("Venda realizada! Produto: R$ %.2f | Frete: R$%.2f | Total: R$ %.2f", valorProduto, valorFrete, valorTotal);
		envioComprovante.enviar(msg);
	}
}
