package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		System.out.print("Enter salary: ");
		double expectedSalary = sc.nextDouble();
		
		try(BufferedReader bc = new BufferedReader(new FileReader(path))){
			List<Employee> employees = new ArrayList<>();
			String line = bc.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				double salary = Double.parseDouble(fields[2]);
				
				employees.add(new Employee(name, email, salary));
				
				line = bc.readLine();
			}
			System.out.println("Email of people whose salary is more than " + expectedSalary);
			
			List<String> list = employees.stream().filter(e -> e.getSalary() > expectedSalary).map(e -> e.getEmail()).sorted().collect(Collectors.toList());
			list.forEach(System.out::println);

			double avgFilter = employees.stream().filter(e -> e.getName().charAt(0) == 'M').map(e -> e.getSalary()).reduce(0.0, (x,y) -> x + y);
			System.out.println("Sum of salary of people whose name starts with 'M': " + avgFilter);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
