package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Entre com o nome do produto: ");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		product.quantity = sc.nextInt();
		
		// Também é possível printar somente o objeto, pois o Java identifica automaticamente o contexto de print, que espera uma String e implicitamente chama um toString()
		System.out.println(product.toString());
		
		System.out.println("Entre com o número de produtos a serem adicionados ao estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Dados atualizados: " + product);
		
		System.out.println("Entre com o número de produtos a serem removidos do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Dados atualizados: " + product);
		sc.close();

	}

}
