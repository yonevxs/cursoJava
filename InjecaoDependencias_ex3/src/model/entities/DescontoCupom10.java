package model.entities;

public class DescontoCupom10 implements EstrategiaDesconto{
	
	@Override
	public double aplicarDesconto(double desconto) {
		return desconto - (desconto * 0.10);
	}

}
