package br.com.treinar.java_basico.estudo.object;

public class Equals {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Pessoa m = new Pessoa("15/11/2012", 0.8F, "Maria Sophia", 555465653);
		Pessoa g = new Pessoa("15/11/2012", 0.8F, "Maria Sophia", 555465653);
		Pessoa n = m;
		System.out.println(m == g);
		System.out.println("m == g: " + m.equals(g));
		
		System.out.println(m.equals(n));
		System.out.println(m == n);
		
		System.out.println(m.equals("Batata"));
		
	}
	
}
