package br.com.treinar.java_basico.estudo.teclado;

import java.util.Scanner;

public class TesteTeclado {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Olá, " + nome);
		
		leitor.close();
	}
	
}
