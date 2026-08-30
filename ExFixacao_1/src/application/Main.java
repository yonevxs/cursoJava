package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.ContaBancaria;
import model.entities.SaldoInsuficienteException;
import model.entities.SessaoAuditoria;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Saldo atual: ");
		double saldo = sc.nextDouble();
		
		System.out.print("Valora a ser sacado: ");
		double valor = sc.nextDouble();
		
		ContaBancaria conta = new ContaBancaria(saldo);
		
		try(SessaoAuditoria auditoria = new SessaoAuditoria()){
			conta.sacar(valor);
		} 
		catch (SaldoInsuficienteException e) {
			System.out.println("Erro no saque: " + e.getMessage());
		}
		finally {
			System.out.println("Obrigado por utilizar nossos serviços bancários.");
		}
		
		sc.close();
	}
}
