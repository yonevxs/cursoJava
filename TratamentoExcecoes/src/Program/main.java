package Program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		method1();
		System.out.println("Fim do programa.");
	}
	
	
	public static void method1() {
		System.out.println("***METHOD 1 START***");
		method2();
		System.out.println("***METHOD 1 END***");
	}
	public static void method2() {
		System.out.println("***METHOD 2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace(); // Imprime o rastreamento do stack
			sc.next();		
		}
		catch (InputMismatchException e) {
			System.out.println("Erro de Input");
		}
		sc.close();
		System.out.println("***METHOD 2 END***");
	}

}
