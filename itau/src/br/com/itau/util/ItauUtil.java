package br.com.itau.util;

import java.util.Scanner;

public class ItauUtil {

	private ItauUtil() {
		
	}
	
	public static Scanner leitor;
	
	static {
		leitor = new Scanner(System.in);
	}
}
