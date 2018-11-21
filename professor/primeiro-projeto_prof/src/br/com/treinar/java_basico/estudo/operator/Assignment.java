package br.com.treinar.java_basico.estudo.operator;

public class Assignment {

	public static void main(String[] args) {
		int a = 10;
		a = a + 5;
		a += 5;
		a -= 5;
		
		int b = (a > 2) ? 20 : 8;
		System.out.println((a > 2) ? 20 : 8);
		System.out.println(b);
	}
	
}
