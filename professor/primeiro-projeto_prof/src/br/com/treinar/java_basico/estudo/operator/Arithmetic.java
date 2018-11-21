package br.com.treinar.java_basico.estudo.operator;

public class Arithmetic {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int soma = a + b;
		System.out.println(soma);
		System.out.println("10" + "20" + a);
		a = 5;
		b = 8;
		System.out.println(b - a);
		System.out.println(a * b);
		
		System.out.println("Dividindo 5 / 8 (float)" + ((float)a / b));
		System.out.println("Dividindo 5 / 8" + (a / b));
		
		System.out.println("Operador modular: " + b % a);
		
		a++;
		System.out.println("Incremento: " + a);
		
		int j = a--;
		System.out.println("Decremento: j = " + j + " a = " + a);
		System.out.println(++a);
		
		boolean variavelAigualVariavelB = a == b;
		System.out.println("a == b? " + variavelAigualVariavelB);
		System.out.println("a != b? " + (a != b));
		System.out.println("Negação: " + !variavelAigualVariavelB);
		
		System.out.println("a = " + a + " b = " + b + " (a > b)? " + (a > b));
		System.out.println("a = " + a + " b = " + b + " (a < b)? " + (a < b));
		System.out.println("a = " + a + " b = " + b + " (a >= b)? " + (a >= b));
		System.out.println("a = " + a + " b = " + b + " (a <= b)? " + (a <= b));
	
		
		
	}

}
