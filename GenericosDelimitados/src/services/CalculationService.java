package services;

import java.util.List;

public class CalculationService {
	
	// T - Tipo de retorno
	// extends Comparable<T> -> Esse método abaixo vai trabalhar com qualquer tipo T desde que T seja qualquer subtipo de comparable<T>
	public static <T extends Comparable<T>> T max(List<T> list) { // <T> - Colocamos isso para indicar quee sse método vai trabalhar com um tipo T 
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) { // Devemos especificar que o tipo T é um tipo comparable -> extends Comparable<T>
				max = item;
			}
		}
		return max;
	}
}
