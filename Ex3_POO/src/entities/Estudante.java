package entities;

public class Estudante {
	public String nome;
	public double n1, n2, n3;
	
	public double calcularMedia() {
		return n1 + n2 + n3;
	}
	
	public double quantosPontosFaltam() {
		if(calcularMedia() < 60.0) {
			return 60 - calcularMedia();
		} else {
			return 0.0;
		}
	}
	
}
