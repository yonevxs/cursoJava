package model.entities;

public class DescontoBlackFriday implements EstrategiaDesconto{
	
	@Override
	public double aplicarDesconto(double desconto) {
		return desconto - (desconto * 0.30);
	}

}
