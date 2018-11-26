package br.com.treinar.java_basico.estudo.object;

public class HashCode {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("15/11/2012", 0.8f, "Maria Sophia", 555);
		Pessoa a = new Pessoa("16/11/2015", 0.9f, "Davi Lucas", 555);
		Pessoa n = new Pessoa("01/01/2018", 0.8f, "Maria Cecilia", 458);
		System.out.println("p: " + p.hashCode());
		System.out.println("a: " + a.hashCode());
		System.out.println("p equals a: " + p.equals(a));
		System.out.println("n: " + n.hashCode());
		
	}
	
}
