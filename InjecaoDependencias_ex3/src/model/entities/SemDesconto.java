package model.entities;

public class SemDesconto implements EstrategiaDesconto{
	
	@Override
	public double aplicarDesconto(double desconto) {
		return desconto;
	}

}
