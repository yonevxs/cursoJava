package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		// Declarando uma lista de numeros inteiros
		//List<tipo>
		// Para instanciar um tipo que é uma INTERFACE, devemos colocar uma CLASSE QUE IMPLEMENTA AS INTERFACES
		List<String> list = new ArrayList<>();
		
		// Adicionando elementos na lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Nanda");
		
		// Inserindo elemento em posição específica
		list.add(2, "Marcos");
		
		// Tamanho da lista
		System.out.println(list.size());
		
		for(String n : list) {
			System.out.println(n);
		}
		System.out.println(" ");
		// Remover um elemento da lista - indíce ou valor
		//list.remove(1);
		
		// Removendo elementos por predicado
		// remover todo elemento x TAL QUE X no indíce 0 seja igual a 'M' -> função lambda (ou predicado)
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println(list.size());
		
		for(String n : list) {
			System.out.println(n);
		}

		
		// Encontrar posição de elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marcos")); // Retorna -1 por não encontrar o elemento
		System.out.println(" ");
		
		// Filtrar indíces
		// stream() - tipo especial que aceita expressões lambda
		// filter() - recebe o predicado (lambda)
		// stream não é compatível com list
		// collect(Collectors.toList()) - converte para List
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String n : result) {
			System.out.println(n);
		}
		System.out.println(" ");
		// Encontrar elemento da lista que atenda determinado predicado
		// Pega o primeiro elemento se tiver, caso não, retorna null
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);  
		System.out.println(name);
		
		}
	

}
