package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		System.out.println("Total area: " + totalArea(myShapes));
		
		// Se a lista fosse de circulos - também é uma figura, mas queremos SOMENTE circulos
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
	}
	
	// Queremos uma função que recebe uma lista de Shape e podendo ser também uma lista de um subtipo de Shape
	public static double totalArea(List<? extends Shape> list) { // Essa lista pode ser do tipo Shape ou de qualquer tipo <?> que seja subtipo de Shape
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
