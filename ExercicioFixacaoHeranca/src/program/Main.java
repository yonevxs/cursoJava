package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		int cont = 1;
		
		sc.nextLine();
		
		while(employees.size() < n) {
			System.out.println("\nEmployee #" + cont + " data:");
			System.out.print("Outsourced? (y/n): ");
			Character outsourced = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			sc.nextLine();
			
			if(outsourced.equals('y')) {
				
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				sc.nextLine();
				
				OutsourcedEmployee out_emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(out_emp);
			} else {				
				Employee emp = new Employee(name, hours, valuePerHour);
				employees.add(emp);
			}
				
				cont++;
		}
		
		System.out.println("PAYMENTS: ");
		for(Employee e : employees) {			
			System.out.print(e.toString());
		}
		
		sc.close();

	}

}
