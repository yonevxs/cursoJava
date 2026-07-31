package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter file path: ");
		// Caminho do arquivo
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		
		// Pasta onde será armazenado o CSV
		String sourceFolderStr = sourceFile.getParent();
		
		// Criando pasta out/ - onde deve estar nosso arquivo CSV
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		// Criando arquivo de saída - summary.csv
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		// Fazendo a leitura do arquivo com try with resources
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			
			String itemCSV = br.readLine();
			// Obtendo os dados das linhas
			while(itemCSV != null) {
				
				String[] fields = itemCSV.split(",");
				String name = fields[0];
				
				// Como o array fields retorna uma string, temos que fazer a conversão para double
				double price = Double.parseDouble(fields[1]);
				
				int qtd = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, qtd));
				
				// Lê os dados do produto, adiciona na lista e vai pro próximo
				itemCSV = br.readLine();
			}
			
			// Após pegarmos os dados, vamos gravá-los no summary.csv - tudo isso dentro do primeiro try, 
			// então, se lermos e dar certo, logo vamos gravar esses dados no arquivo
			
			// Criando o arquivo de saída - summary.csv
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				
				// Percorrendo a lista de produtos e gravando nas linhas
				for(Product item : list) {
					bw.write(item.getNome() + ", " + String.format("%.2f", item.valorTotal()));
					bw.newLine();
				}
				System.out.println(targetFileStr + " CRIADO COM SUCESSO!'");
			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
			
		} catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		
		
		sc.close();
	}

}
