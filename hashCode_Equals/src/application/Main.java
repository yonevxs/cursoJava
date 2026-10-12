package application;

import entities.Client;

public class Main {

	public static void main(String[] args) {
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		String a = "Maria";
		String b = "Alex";
		
		String s1 = "teste";
		String s2 = "teste";
		System.out.println(a.equals(b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); // Compara por conteúdo
		System.out.println(c1 == c2); // Deu false porque compara as referências de memória, não o conteúdo da variável
		
		System.out.println(s1 == s2); // Dá true porque o compilador trata expressões literais ("true") de forma diferente
		// O que não acontece caso façamos a instânciação de um objeto String de forma comum (new String("teste"))
	}

}
