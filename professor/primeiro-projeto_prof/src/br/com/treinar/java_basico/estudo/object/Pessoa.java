package br.com.treinar.java_basico.estudo.object;

public class Pessoa {

	private String dataNascimento;
	private float altura;//modificador privado so pode ser acessado na propria classe
	float peso;//modificador default pode ser acessado na classe e nas classes do mesmo pacote
	public String nome;//pode ser acessado em qualquer ponto do projeto.
	
	public Pessoa(String dataNascimento, float tamanho) {
		this.dataNascimento = dataNascimento;
		this.crescer(tamanho);
	}
	
	public Pessoa(String dataNascimento, float tamanho, String nome) {
		this(dataNascimento, tamanho);
		this.nome = nome;
	}

	/**
	 * 
	 */
	public void crescer() {
		altura += 0.01F;
	}
	
	/**
	 * Aumenta o tamanho da pessoa blah blah blah
	 * @param tamanhoEmCentimetros tamanho que a pessoa cresceu
	 */
	public void crescer(float tamanhoEmCentimetros) {
		altura += tamanhoEmCentimetros;
	}
	
	/*
	 * eu programador quero escrever um texto grande
	 * para documentar meu codigo
	 * */
	/**
	 * 
	 * @return retorna o indice de massa corporal baseado na formula
	 * peso x altura ao quadrado dividido por dois
	 */
	public float recuperarIMC() {//eu programador quero entender esta linha
		float imc = peso * (altura * altura) / 2;
		return imc;
	}

	public float recuperarAltura() {
		return altura;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}
