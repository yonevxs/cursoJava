package model.entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GerenciadorArquivos {
	private String path;
	private String text;
	
	public GerenciadorArquivos(String path, String text) {
		this.path = path;
		this.text = text;
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public void gravarNota(String path, String text) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			bw.write(text);
			bw.newLine();
			System.out.println("Nota gravada com sucesso!");
		} catch (Exception e) {
			System.out.println("Error: " + 	e.getMessage());
		}
	}
	
	public void lerNotas(String path) {
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();;
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
