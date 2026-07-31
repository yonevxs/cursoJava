package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// Lista com tipo genérico
		// Dentro dessa lista, usando upcasting, podemos inserir tanto o objeto SavingsAccount quanto o BussinessAccount
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BussinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		list.add(new BussinessAccount(1005, "Ana", 500.0, 500.0));
		
		double soma = 0;
		
		for (Account acc : list) {
			soma += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", soma);
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		for(Account acc : list) {
			System.out.printf("UPDATED BALANCE FOR ACCOUNT %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}

}
