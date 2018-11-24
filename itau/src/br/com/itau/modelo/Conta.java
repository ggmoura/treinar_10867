package br.com.itau.modelo;

public abstract class Conta {

	private int numeroConta;
	private Cliente cliente;
	protected double saldo;

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;			
		}
	}
	
	public abstract void sacar(double valor);
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", cliente=" + cliente + ", saldo=" + saldo + "]";
	}
	
	

}
