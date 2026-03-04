package application;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		double maior = vet[0];
		int pos = 0;
		for(int i = 1; i < vet.length; i++) {
			if(vet[i] > maior) {
				maior = vet[i];
				pos = i;
			}
		}
		System.out.println("MAIOR VALOR: " + maior);
		System.out.println("POSIÇÃO DO MAIOR VALOR: " + pos);
		
		

	}

}
