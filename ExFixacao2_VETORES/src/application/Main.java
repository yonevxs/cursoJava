package application;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		double media, soma;
		
		double[] vect = new double[n];
		
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("\nValores = " );
				for(int i = 0; i < vect.length; i++) {
					System.out.print(vect[i] + " ");
				}
				
		soma = 0;
		for(int i = 0; i < vect.length; i++) {
			soma = soma + vect[i];
		}	
		System.out.println("\nSoma = " + String.format("%.2f", soma));

		media = soma / n;
		System.out.println("Média = " + String.format("%.2f", media));
		

	}

}
