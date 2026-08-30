package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import services.ListUtils;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 0 para sair");
		System.out.print("Insira os elementos da sua lista: ");
		int n = 1;
		List<Integer> list = new ArrayList<>();
		
		while (n != 0) {
			n = sc.nextInt();
			
			if(n == 0) {
				break;
			}
			
			list.add(n);
		}

		ListUtils.printList(list);
		
		sc.close();
	}

}
