package application;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Lucas", 0.0);
		BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING - Subclasse para Superclasse
		
		Account acc1 = bacc; // Não da erro pq herança é uma relação "é um", ou seja, uma BusinessAccount é uma Account
		Account acc2 = new BussinessAccount(1003, "Bob", 0.0, 200.0); // Não da erro pq esta atribuindo um objeto da subclasse pra uma superclasse
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		// DOWNCASTING - Superclasse para Subclasse
		
		BussinessAccount acc4 = (BussinessAccount) acc2; ;// Não pode converter de Account para BusinessAccount, temos que fazer o Casting manual
		acc4.loan(100.0);
		
		
		// acc3 foi instanciada como SavingsAccount, não como BusinessAccount
		// SavingsAccount é uma Account, mas não é uma BusinessAccount
		// É uma operação que não é permitida
		// Mas o compilador não sabe que o acc3 é um SavingsAccount, então só dará problema ao executar
		
		// BussinessAccount acc5 = (BussinessAccount) acc3;
		
		// Vamos verificar se o objeto é uma instância de BussinessAccount
		if(acc3 instanceof BussinessAccount) {
			BussinessAccount acc5 = (BussinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3; // convertendo acc3 para SavingsAccount
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		
		
	}

}
