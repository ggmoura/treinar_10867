package br.com.itau.modelo;

public class ContaPoupanca extends Conta implements IContaCaptalizavel {

	private float taxaRendimento;

	public float getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(float taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public void sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
		}
	}

	@Override
	public void captalizar() {
		saldo = saldo + saldo * taxaRendimento;
	}
	
}
