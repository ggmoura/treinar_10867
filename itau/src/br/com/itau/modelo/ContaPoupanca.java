package br.com.itau.modelo;

public class ContaPoupanca extends Conta implements IContaCaptalizavel {

	private static float taxaRendimento;
	private int diaAniversario;

	public float getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(float taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
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
