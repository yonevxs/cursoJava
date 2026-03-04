package application;
import java.util.Scanner;
import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com o número da conta: ");
		int numeroConta = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Entre com o nome do titular: ");
		String nome = scanner.nextLine();
		
		ContaBancaria cb = new ContaBancaria(numeroConta, nome);
		
		System.out.print("Gostaria de fazer um depósito inicial? (S/N): ");
		char escolha = scanner.next().charAt(0);
		if(escolha == 'S') {
			System.out.print("Entre com o valor inicial de depósito: ");
			double saldoConta = scanner.nextDouble();
			cb.addSaldo(saldoConta);
		} else {
			cb.toString();
		}
		
		System.out.println("");
		System.out.println("Dados da conta: ");
		System.out.println(cb.toString());
		System.out.println("");
		
		System.out.print("Entre com o valor inicial de depósito: ");
		double saldoConta = scanner.nextDouble();
		cb.addSaldo(saldoConta);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(cb.toString());
		System.out.println("");
		
		System.out.print("Entre com o valor de saque: ");
		double saqueConta = scanner.nextDouble();
		cb.saqueSaldo(saqueConta);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(cb.toString());
		
		scanner.close();
	}

}
