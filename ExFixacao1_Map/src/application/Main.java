package application;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new TreeMap<>();
		
		System.out.print("Digite o texto: ");
		String frase = sc.nextLine();
		String[] fraseVetor = frase.toLowerCase().split("[,\\s]+");
		
		for (String s : fraseVetor) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		
		for (String s : map.keySet()){
			System.out.println(s + ": " + map.get(s));
		}
		sc.close();
	}
}
