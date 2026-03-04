package application;

import java.util.Scanner;
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Salário Bruto: ");
		emp.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		emp.imposto = sc.nextDouble();
		
		System.out.println(emp);
		
		System.out.println("Percentual para aumento de salário: ");
		double pc = sc.nextDouble();
		emp.aumentarSalario(pc);
		
		System.out.println("Dados atualizados: " + emp);

	}

}
