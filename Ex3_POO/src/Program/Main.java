package Program;
import java.util.Scanner;
import java.util.Locale;
import entities.Estudante;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante es = new Estudante();
		
		es.nome = sc.nextLine();
		es.n1 = sc.nextDouble();
		es.n2 = sc.nextDouble();
		es.n3 = sc.nextDouble();
		
		System.out.printf("Grade final = %.2f%n ", es.calcularMedia());
		
		if(es.calcularMedia() < 60) {
			System.out.println("REPROVADO");
			System.out.printf("FALTA %.2f PONTOS%n",es.quantosPontosFaltam());
		} else {
			System.out.println("APROVADO");
		}
		
		sc.close();
		
		

	}

}
