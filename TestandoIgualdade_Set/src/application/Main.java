package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.00));
		set.add(new Product("Notebook", 1200.00));
		set.add(new Product("Tablet", 400.00));
		
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(prod)); // Deu true porque a nossa classe Product implementa os métodos HashCode e equals
		// A comparação foi feita por conteúdo, não por referência de ponteiro de objeto

	}

}
