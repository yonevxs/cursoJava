package application;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		
		int pares = 0;
		System.out.println("NÚMEROS PARES: ");
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				pares += 1;
			}
		}
		
		System.out.println("\nQUANTIDADE DE PARES: " + pares);
	}

}
