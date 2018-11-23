package br.com.itau.modelo;

public class ContaCorrente extends Conta {

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
		if (valor > 0 && saldo >= (valor + 1)) {
			saldo -= valor + 1;
		}
	}

}
