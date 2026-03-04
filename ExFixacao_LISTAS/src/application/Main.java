package application;
import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos empregados serão registrados? ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println(" ");
			System.out.println("Empregado #" + (i + 1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			
			Employee emp = new Employee(id, nome, salario);
			list.add(emp);
		}
		
		System.out.print("\nEntre com o Id do empregado para realizar o aumento de salário: ");
		int id_salary = sc.nextInt();
		Integer pos = position(list, id_salary);
		if(pos == null) {
			System.out.println("Esse ID não existe!");
		} 
		else {
			System.out.print("Entre com a porcentagem: ");
			double percent = sc.nextDouble();
			list.get(pos).IncreaseSalary(percent);
		}
		
		for(Employee e : list) {
			System.out.println(e);
		}
		
		sc.close();
	}
	
	
	// tem que ser static porque o main é static
	
	public static Integer position(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			// list.get() - pega o elemento na posição
			// se o elemento da posição i
			if(list.get(i).getId() == id) {
				return i; 
			}
		}
		return null;
	}

}
