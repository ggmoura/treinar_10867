package br.com.treinar.java_basico.atividade;

import java.util.Scanner;

public class AtividadeLoop {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		String nome = null;
		do {
			System.out.print("Informe:\n\t1 - Digitar nome\n\t0 - Sair\n=> ");
			opcao = leitor.nextInt();
			leitor.nextLine();
			if (opcao == 1) {
				System.out.print("Informe o nome: ");
				nome = leitor.nextLine();
				System.out.println(nome);
			}
		} while (opcao == 1);
		leitor.close();
		System.out.println("------ FIM -------");
	}
	
}
