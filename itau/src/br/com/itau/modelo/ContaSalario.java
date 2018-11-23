package br.com.itau.modelo;

public class ContaSalario extends Conta {

	private int diaDeposito;

	public int getDiaDeposito() {
		return diaDeposito;
	}

	public void setDiaDeposito(int diaDeposito) {
		this.diaDeposito = diaDeposito;
	}
	
	public void sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
		}
	}

}
