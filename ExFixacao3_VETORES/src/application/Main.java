package application;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("\nDados da " + (i + 1) + "° pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		double soma_altura = 0;
		for(int i = 0; i < n; i++) {
			soma_altura += altura[i];
		}
		
		double media = soma_altura / n;
		System.out.printf("\nAltura média: %.2f%n", media);
		
		
		double menores_16 = 0;
		for(int i = 0; i < idade.length; i++) {
			if(idade[i] < 16) {
				menores_16 += 1;
			}
		}
		double porcentagem = (menores_16 * 100) / n;
		System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
		
		for(int i = 0; i < n; i++) {
			if(idade[i] < 16) {
				System.out.printf("%s\n", nome[i]);
			}
		}
		
		sc.close();
	}

}
