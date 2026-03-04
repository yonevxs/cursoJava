import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// int n1 = 89;
		// int n2 = 60;
		// System.out.println(n1 & n2);
		// System.out.println(n1 | n2);
		// System.out.println(n1 ^ n2);
		
		Scanner sc = new Scanner(System.in);
		int mascara = 32; // ou 0b00100000
		int n = sc.nextInt();
		
		// Será que o sexto bit que o usuário digitar vale 1 ou 0?
		// Se N E bit a bit com a MASCARA for DIFERENTE de 0
		if( (n & mascara) != 0) {
			System.out.println("6° bit é TRUE e diferente de zero!");
		} else {
			System.out.println("6° bit é FALSE e igual a zero!");
		}
		sc.close();
	}

}
