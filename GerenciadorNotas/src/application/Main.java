package application;

import java.util.Scanner;

import model.entities.GerenciadorArquivos;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do caminho onde irá armazenar o arquivo: ");
		String path = sc.nextLine();
		
		System.out.println("Digite o conteúdo do arquivo: ");
		String text = sc.nextLine();
		
		GerenciadorArquivos ga = new GerenciadorArquivos(path, text);
		ga.gravarNota(path, text);
		ga.lerNotas(path);
		
	}
}
