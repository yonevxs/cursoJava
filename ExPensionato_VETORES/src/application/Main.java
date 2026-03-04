package application;
import java.util.Scanner;
import entities.Aluguel;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluguel[] quartos = new Aluguel[10];
		
		System.out.print("Quantos quartos serão alugados: ");
		int quartos_alugados = sc.nextInt();
		
		for(int i = 1; i <= quartos_alugados; i++) {
			sc.nextLine();
			System.out.println("\nQuarto #: " + i);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Quarto: ");
			int n_quarto = sc.nextInt();
			
			Aluguel aluguel = new Aluguel(nome, email);
				
			quartos[n_quarto] = aluguel; // Ou somente = new Aluguel(nome, email)
		}
		
		System.out.println("");
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);	
			}
		}
		
		sc.close();
	}

}
