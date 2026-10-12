package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10); // Operação intermediária
		System.out.println(Arrays.toString(st1.toArray())); // Operação terminal
		
		// somando todos os elementos da stream
		int sum = list.stream().reduce(0, (x,y) -> x + y); // reduce() - Pega o elemento inicial (neutro) e depois uma função que recebe dois argumentos e gera um resultado
		System.out.println("Sum = " + sum);
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0) // Filtra minha lista através de um predicado
				.map(x -> x * 10) // Transforma em outra stream
				.collect(Collectors.toList()); // Transforma a stream em uma lista
		
		System.out.println(Arrays.toString(newList.toArray())); // List também tem operação toArray()
	}

}
