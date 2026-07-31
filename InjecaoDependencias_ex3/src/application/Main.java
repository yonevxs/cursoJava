package application;

import model.entities.CarrinhoDeCompras;
import model.entities.DescontoBlackFriday;
import model.entities.DescontoCupom10;
import model.entities.SemDesconto;

public class Main {

	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras(new SemDesconto());
		carrinho.calcularTotal(200);

		carrinho.setDesconto(new DescontoCupom10());
		carrinho.calcularTotal(200);
		
		carrinho.setDesconto(new DescontoBlackFriday());
		carrinho.calcularTotal(200);
	}

}
