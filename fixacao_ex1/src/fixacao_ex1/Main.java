package fixacao_ex1;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.23467;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $%.2f%n", product1, price1);
		System.out.printf("%s, which price is $%.2f%n", product2, price2);
		System.out.printf("\n");
		System.out.printf("Record: %d years old, code %d and gender: %s", age, code, gender);
		System.out.printf("\n");
		System.out.printf("Measue with eight decimal places: %.7f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Rouded (three decimal places): %.3f", measure);

	}

}
