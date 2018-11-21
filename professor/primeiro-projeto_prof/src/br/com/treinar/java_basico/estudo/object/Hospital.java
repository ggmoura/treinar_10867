package br.com.treinar.java_basico.estudo.object;

public class Hospital {

	public static void main(String[] args) {
		
		Pessoa fulano = null;
		
		fulano = new Pessoa();
		fulano.nome = "Maria Sophia";
		fulano.altura = 0.8F;
		System.out.println("Antes de crescer! " + fulano.altura);
		fulano.crescer();
		System.out.println("Depois de crescer! " + fulano.altura);
		
		System.out.println(fulano.nome);
		System.out.println(fulano.altura);
		
		Pessoa tempo = new Pessoa();
		tempo.nome = "Emanuelle";
		tempo.altura = 1.5F;
		
		Pessoa xpto = fulano;
		
		System.out.println("Nome a partir da referencia xpto: " + xpto.nome);
		xpto.altura = 0.81F;
		
		System.out.println(fulano.altura);
		
		fulano = null;
		xpto = null;

		
		
	}
	
}
