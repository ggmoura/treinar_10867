package br.com.treinar.java_basico.estudo.array;

public class EstudoMatriz {

	public static void main(String[] args) {
		int[][] mtz = new int[4][4];
		
		mtz[2][2] = 10481;
		
		System.out.println(mtz[2][2]);
		
		int[][] mtz2 = {{10, 20}, {20, 30, 5}, {5}};
		for (int i = 0; i < mtz2.length; i++) {
			for (int j = 0; j < mtz2[i].length; j++) {
				System.out.print(mtz2[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
