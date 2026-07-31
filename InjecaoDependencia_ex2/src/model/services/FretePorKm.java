package model.services;

public class FretePorKm implements CalculadoraFrete{

	@Override
	public Double calcular(Double distanciaKm) {
		return distanciaKm * 2.50;
	}
}
