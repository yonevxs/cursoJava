package model.services;

public class FreteFixo implements CalculadoraFrete{
	
	@Override
	public Double calcular(Double distanciaKm) {
		return 15.0;
	}
}
