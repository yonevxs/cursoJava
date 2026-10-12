package application;

import java.util.Comparator;

import entities.Product;
 // Criando classe com a implementação da interface Comparator 
public class MyComparator implements Comparator<Product>{

	@Override
	public int compare(Product obj1, Product obj2) {
		return obj1.getName().toUpperCase().compareTo(obj2.getName().toUpperCase());
	}
	
}
