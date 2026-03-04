package calculo_diferenca;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, d;
		int diferenca;
		
		System.out.print("Digite o valor de A: ");
		a = scan.nextInt();
		System.out.print("Digite o valor de B: ");
		b = scan.nextInt();
		System.out.print("Digite o valor de C: ");
		c = scan.nextInt();
		System.out.print("Digite o valor de D: ");
		d = scan.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.println("Diferença = " + diferenca);
		
		

	}

}
