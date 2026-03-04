package raio_circulo;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double r;
		double area;
		double pi = 3.14159;
		
		System.out.print("Digite o raio do circulo: ");
		r = scan.nextDouble();
		
		area = pi * (Math.pow(r, 2));
		
		System.out.printf("A = %.4f%n", area);
		
		

	}

}
