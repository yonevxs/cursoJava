package application;

import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo r = new Retangulo();
		
		System.out.println("Entre com a largura e altura do retângulo: ");
		r.largura = sc.nextDouble();
		r.altura = sc.nextDouble();
		
		double area = r.area();
		double perimetro = r.perimetro();
		double diagonal = r.diagonal();
		System.out.println("AREA: " + area);
		System.out.println("PERÍMETRO: " + perimetro);
		System.out.println("DIAGONAL: " + diagonal);

	}

}
