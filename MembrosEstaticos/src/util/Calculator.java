package util;

public class Calculator {
	// PODEM SER CALCULADOS INDEPENDENTE DE OBJETOS
	public static final double PI = 3.14159; // Membro estático da minha classe
	
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}
}
