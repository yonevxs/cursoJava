package util;

import java.util.function.Function;

import entities.Product;

public class UppercaseName implements Function<Product, String>{ // (Entrada, Saída) - como queremos transformar objetos Product em nomes de Product
	// O tipo de entrada vai ser Product e o tipo de saída vai ser String

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}
