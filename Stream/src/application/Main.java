package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		// Criando stream a partir de uma coleção
		Stream<Integer> st1 = list.stream().map(x -> x * 10); // map() -> aplica uma função a cada elemento da minha stream
		System.out.println(Arrays.toString(st1.toArray())); // toArray -> converte a stream para um vetor
		
		// Criando stream a partir da função of()
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); // of() -> permite colocar os elementos diretamente entre os parenteses
		System.out.println(Arrays.toString(st2.toArray()));
		
		// Criando stream a partir de uma função de iteração
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // iterate(primeiro elemento, função de iteração para gerar os próximos elementos)
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		// Operações intermediárias ficam na metade da operação e as terminais ao fim?
		
		// Gerando stream sequência de fibonacci
		// Como o Java não permite tupla, vamos utilizar long
		// o iterate vai gerar uma stream de pares, então vamos inserir o map() para transforma-los em apenas 1 elemento
		Stream<Long> fibonacci = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(fibonacci.limit(10).toArray()));
		
		// Como sabe que vai iterar de 1 em 1? É padrão?
	}
}
