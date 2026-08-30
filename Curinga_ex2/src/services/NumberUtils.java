package services;

import java.util.List;

public class NumberUtils {
	public static double calcularMedia(List<? extends Number> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("A lista não pode estar vazia");
		}
		
		double soma = 0.0;
		for(Object obj : list) {
			soma += ((Number) obj).doubleValue();
		}
		return soma / list.size();
	}
	
	public static void copiarNumeros(List<? extends Number> origem, List<? super Number> destino) {
		for (Number n : origem) {
			destino.add(n);
		}
	}
}
