package application;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// SOMA DE VETORES 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores vai ter em cada vetor?: ");
		int n = sc.nextInt();
		
		System.out.println("Digite os valores do vetor A: ");
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++) {
			System.out.print( (i + 1) + "° valor: ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		int[] b = new int[n];
		for(int i = 0; i < b.length; i++) {
			System.out.print( (i + 1) + "° valor: ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE");
		int[] c = new int[n];
		for(int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];	
			System.out.println(c[i]);
		}

	}

}
