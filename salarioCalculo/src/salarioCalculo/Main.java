package salarioCalculo;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int n;
		double h;
		double vl;
		double salario;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nº do Funcionário: ");
		n = scan.nextInt();
		
		System.out.println("Horas trabalhadas: ");
		h = scan.nextDouble();
		
		System.out.println("Valor recebido por hora: ");
		vl = scan.nextDouble();
		
		salario = vl * h;
		
		System.out.println("NUMBER = " + n);
		System.out.println("SALARY = U$" + salario);
		
		scan.close();
		
		
	}

}
