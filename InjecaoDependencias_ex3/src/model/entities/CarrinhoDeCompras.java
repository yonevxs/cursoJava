package model.entities;

public class CarrinhoDeCompras {
	private EstrategiaDesconto desconto;
	
	public CarrinhoDeCompras(EstrategiaDesconto desconto) {
		this.desconto = desconto;
	}
	
	public void setDesconto(EstrategiaDesconto novoDesconto) {
		this.desconto = novoDesconto;
	}
	
	public void calcularTotal(double valorBruto) {
		double produtoDesconto = desconto.aplicarDesconto(valorBruto);
		String msg = String.format("Valor do produto: R$%.2f | Com Cupom de Desconto: R$%.2f", valorBruto, produtoDesconto);
		System.out.println(msg);
	}
}
