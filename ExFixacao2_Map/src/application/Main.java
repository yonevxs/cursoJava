package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Double> salesRegister = new LinkedHashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				String[] values = line.split(",");
				String name = values[0];
				int qtd = Integer.parseInt(values[1]);
				double price = Double.parseDouble(values[2]);
				
				double total = qtd * price;
				
				// se já tiver o valor no Map, apenas atualiza
				if (salesRegister.containsKey(name)) {
					salesRegister.put(name, salesRegister.get(name) + total);
				} else {
					salesRegister.put(name, total);
				}
				
				line = br.readLine();
			}
			
			for (String s : salesRegister.keySet()) {
				System.out.println(s + ": R$" + String.format(Locale.US,"%.2f", salesRegister.get(s)));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
