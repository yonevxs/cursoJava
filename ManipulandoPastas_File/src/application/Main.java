package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Pegando todas as pastas que estiverem a partir desse path
		File[] folders = path.listFiles(File::isDirectory); // Lista somente o que for diretório
		
		System.out.println("FOLDERS");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES");
		for (File file : files) {
			System.out.println(file);
		}
		sc.close();
		
		// Criando subpasta a partir da pasta digitada
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);

	}

}
