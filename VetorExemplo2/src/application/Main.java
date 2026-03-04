package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		// Cada posição em um vetor de objetos é somente uma referência!
		// É necessário instanciar cada posição
		
		// Ao invés de usar N, podemos utilizar o atributo LENGTH, que pega o tamanho de um vetor (qtd de elementos do vetor)
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		
		double soma = 0;
		for(int i = 0; i < vect.length; i++) {
			// Acessando vetor na posição i e pegando somente o PREÇO!!!!
			soma += vect[i].getPrice();
		}
		
		double avg =  soma / vect.length;
		System.out.printf("Preço médio: %.2f%n", avg);
		sc.close();

	}

}
