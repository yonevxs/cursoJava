package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de formas: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Dados da forma #" + i + ": ");
			System.out.print("Retângulo ou Circulo (r/c): ");
			char ch = sc.next().charAt(0);
			System.out.print("Cor (Black/Blue/Red): ");
			Color color = Color.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.print("Largura: ");
				double width = sc.nextDouble();
				System.out.print("Altura: ");
				double height = sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Raio: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
			
		}
		System.out.print("");
		System.out.println("Area das Formas: ");
		for(Shape shape : list) {
			System.out.print(String.format("%.2f", shape.area()));
		}
		sc.close();

	}

}
