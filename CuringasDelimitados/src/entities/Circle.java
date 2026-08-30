package entities;

public class Circle implements Shape{
	private double radius;
	
	public Circle(Double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
