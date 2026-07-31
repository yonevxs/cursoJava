package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// Instanciamos um objeto do tipo File - que vai encapsular o processo de acessar um arquivo/seu caminho
		File file = new File("C:\\Users\\Casa\\Desktop\\in.txt"); // Utilizamo "\\" pq somente "\" é o prefixo de caracteres especiais
		// Como "\n" etc, então para indicarmos que queremos somente uma barra invertida "\", colocamos 2 barrras "\\"
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) { // Verifica se há outra(s) linha(s) no arquivo		
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {				
				sc.close(); // Fecha o recurso independente do try dar certo ou não, mas só se o scanner tiver alguma leitura
			}
		}
	}

}
