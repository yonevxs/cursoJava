package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();	
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();	
		sc.nextLine();
		
		for(int i = 0; i < n; i ++) {
			System.out.print("Product #" + (i + 1) + " data: ");
			System.out.print("\nCommon, used or imported (c/u/i)?: ");
			char type_p = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(type_p == 'i') {
				System.out.print("Customs Fee: ");
				Double customsFee = sc.nextDouble();
				
				ImportedProduct ip = new ImportedProduct(name, price, customsFee);
				list.add(ip);
			} else if(type_p == 'u') {
				System.out.print("Manufactured Date (DD/MM/YYYY: ");
				LocalDate dt = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				UsedProduct up = new UsedProduct(name, price, dt);
				list.add(up);
			} else {
				list.add(new Product(name, price));
			}	
		}
		System.out.println();
		
		System.out.println("PRICE TAGS: ");
		for(Product p : list) {
			System.out.println(p.priceTag());
		}
		sc.close();
	}
}
