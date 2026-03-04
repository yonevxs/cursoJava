package application;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		
		int[] num = new int[n];
			
			for(int i = 0; i < num.length; i++) {
				System.out.print("Digite um número: ");
				num[i] = sc.nextInt();	
			}
			
			System.out.println("Numeros negativos: ");
			
			for(int i = 0; i < num.length; i++) {
				if(num[i] < 0) {
					System.out.printf("%d\n", num[i]);
				}
			}
			sc.close();
		}
	}
