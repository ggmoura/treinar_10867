package br.com.treinar.java_basico.estudo.decision;

public class TestIfElse {

	public static void main(String args[]) {
		int x = 30;

		if (x < 20) {
			System.out.print("This is if statement");
			if (x == 1) {
				System.out.println("x eh um");
			}
		} else {
			System.out.print("This is else statement");
		}
	}
}