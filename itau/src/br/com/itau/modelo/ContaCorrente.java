package br.com.itau.modelo;

public class ContaCorrente extends Conta {

	private static final double VALOR_SAQUE;
	
	/**
	 * bloco de inicializacao de atributos static, executado apenas 
	 * uma vez, quando a JVM conhece a classe
	 */
	static {
		VALOR_SAQUE = 1;
	}
	
	static {
		//posso ter varios blocos de inicializacao de atributos static
		//estes serao executados respeitando a regra a cima, na ordem
		//em que foram declarados.
	}
	
	private double taxaManutencao;

	public double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}
	
	public void sacar(double valor) {
		/*
		 * regra de negocio cobra-se um real por saque
		 * para sacar um valor n o saldo devera ser n + 1
		*/
		if (valor > 0 && saldo >= (valor + VALOR_SAQUE)) {
			saldo -= valor + VALOR_SAQUE;
		}
	}

}
