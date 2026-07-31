package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoa = new ArrayList<>();
		
		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do contribuinte #" + i);
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char tipo_pessoa = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			sc.next();
			
			System.out.print("Renda anual: ");
			Double renda_anual = sc.nextDouble();
			
			if(tipo_pessoa == 'f') {
				System.out.print("Gastos com saúde: ");
				Double gastos_saude = sc.nextDouble();
				pessoa.add(new PessoaFisica(nome, renda_anual, gastos_saude));
			} else {
				System.out.print("Número de funcionários: ");
				int n_funcionarios = sc.nextInt();
				pessoa.add(new PessoaJuridica(nome, renda_anual, n_funcionarios));
			}
		}
		
		System.out.println();
		System.out.println("TAXAS DE IMPOSTO:");
		double soma = 0;
		
		for(Pessoa p : pessoa) {
			System.out.println(p.getNome() + ": " + p.imposto());
			soma += p.imposto();
		}
		
		System.out.println("TOTAL DE IMPOSTOS: R$" + String.format("%.2f", soma));
		
		sc.close();
	}
}
