package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Map<Product, Integer> stock = new HashMap<>();
		
		stock.put(new Product("TV", 900.0), 10);
		stock.put(new Product("Notebook", 1200.0), 5);
		stock.put(new Product("Tablet", 400.0), 15);
		
		Product p = new Product("TV", 900.0);
		
		System.out.println(stock.containsKey(p));
		System.out.println(stock.get(p));
		
		for(Map.Entry<Product, Integer> entry : stock.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
