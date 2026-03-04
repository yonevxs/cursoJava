package entrada_dados;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();	
		sc.nextLine(); // Consome a quebra de linha pendente
		s1 = sc.nextLine(); // Lê a linha inteira, diferente do next() que lê somente a primeira palavra
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		sc.close();
	}

}
