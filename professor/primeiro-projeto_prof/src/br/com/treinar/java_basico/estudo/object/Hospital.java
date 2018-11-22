package br.com.treinar.java_basico.estudo.object;

public class Hospital {

	public static void main(String[] args) {
		
		Pessoa fulano = null;
		
		fulano = new Pessoa("Maria Sophia", 0.8F);
		fulano.nome = "Maria Sophia";
		//fulano.altura = 9.8F; atributo privado
		fulano.crescer(0.8f);
		fulano.peso = 30f;
		System.out.println("Antes de crescer! " + fulano.recuperarAltura());
		fulano.crescer();
		System.out.println("Antes de crescer mais de um cm! " + fulano.recuperarAltura());
		fulano.crescer(0.10f);
		System.out.println("Depois de crescer! " + fulano.recuperarAltura());
		
		//recebendo retorno do metodo
		float imcDeFulano = fulano.recuperarIMC();
		System.out.println("IMC de Fulano: " + imcDeFulano);
		
		System.out.println(fulano.nome);
		System.out.println(fulano.recuperarAltura());
		
		Pessoa tempo = new Pessoa("Maria Sophia", 0.8F);
		tempo.nome = "Emanuelle";
//		tempo.altura = 1.5F; //atributo privado
		tempo.crescer(1.5F);
		
		Pessoa xpto = fulano;
		
		System.out.println("Nome a partir da referencia xpto: " + xpto.nome);
//		xpto.altura = 0.81F; //atributo privado
		xpto.crescer(0.81F);
		
		System.out.println(fulano.recuperarAltura());
		
		fulano = null;
		xpto = null;

		
		
	}
	
}
