package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.entities.Product;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.0));
		list.add(new Product("Tablet", 1200.0));
		list.add(new Product("Xbox X", 3000.0));
		list.add(new Product("Tamagoshi", 100.0));
		list.add(new Product("Paçoca", 10.0));
		
		list.forEach(System.out::println);
		
		String produtos = list.stream().filter(p -> p.getPrice() > 100.0).map(Product::getName).map(String::toUpperCase).collect(Collectors.joining(", "));
		
		System.out.println();
		System.out.println("Produtos com preço maior que R$100.0");
		System.out.println(produtos);

	}
}
