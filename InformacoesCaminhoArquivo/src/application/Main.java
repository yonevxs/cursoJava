package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Como podemos obter informações sobre o caminho do arquivo
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Nome do arquivo
		System.out.println("getName: " + path.getName());
		
		// Somente o path
		System.out.println("getParent: " + path.getParent());
		
		// Todo o path
		System.out.println("getPath: " + path.getPath());
		
		sc.close();

	}

}
