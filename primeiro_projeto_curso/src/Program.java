import java.util.Locale;

public class Program {
	public static void main(String[] args){
		int y = 32;
		double x = 10.35574;
		System.out.println("To fazendo o curso do Nélio!");
		System.out.println(y);
		System.out.printf("%.2f%n", x);
		
		// Modifica a localização do programa
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		
		System.out.println("Resultado: " + x + " metros");
		
		System.out.printf("Resultado: %.2f metros%n", x);
		
		// Concatenando vários elementos
		String nm = "Maria";
		int idd = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$%.2f %n", nm, idd, renda);
		
		
	}
}
