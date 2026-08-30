package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> { // T pode ser o nome que quiser, mas deve usar a mesma letra ao longo da implementação da classe
	List<T> list = new ArrayList<>(); // T pode ser um tipo qualquer, mas garante reuso e type safety	
	
	public void addValue(T value) {
		list.add(value);	
	}
	
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
