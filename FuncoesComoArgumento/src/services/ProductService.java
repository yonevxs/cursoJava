package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p)) { // Isso que estamos testando é um predicado (Predicate), a partir de um produto p, testamos se a primeira letra dele é T
				// E a resposta é um verdadeiro ou falso, isso é um Predicate do tipo Product
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
