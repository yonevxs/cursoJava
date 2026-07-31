package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// Testando exceção
		String path = "C:\\Users\\Casa\\Desktop\\ina.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			// Estabelecendo uma stream (sequência de leitura) a partir do arquivo que estiver no path
			fr = new FileReader(path);
			br = new BufferedReader(fr); // O BufferedReader é instanciado a partir do FileReader, é uma abstração maior
			// a instanciação do FileReader também pode ser dentro do parâmetro do BufferedReader: br = new BufferedReader(new FileReader(path))
			
			// Se o arquivo já estiver no final, terá retorno null
			String line = br.readLine();
			
			// Lendo um arquivo com BufferedReader
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			// Também pode ocorrer exceptions (IOException) na hora de fechar os streams
			try {				
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
