package br.com.itau.servico;

import br.com.itau.modelo.Cliente;
import br.com.itau.modelo.Conta;
import br.com.itau.modelo.ContaCorrente;
import br.com.itau.modelo.ContaPoupanca;
import br.com.itau.modelo.ContaSalario;
import br.com.itau.modelo.IContaCaptalizavel;
import br.com.itau.util.ItauUtil;

public class ItauService {

	private Conta[] contas;
	private int index;
	
	public ItauService() {
		contas = new Conta[10];
		index = 0;
	}

	public void cadastrarConta(int tipoConta) {
		switch (tipoConta) {
		case 1:
			contas[index] = new ContaPoupanca();
			cadastrarContaGenerica(contas[index]);
			index++;
			break;
		case 2:
			contas[index] = new ContaCorrente();
			cadastrarContaGenerica(contas[index]);
			System.out.print("Informe o valor da taxa de manutenção: ");
			((ContaCorrente) contas[index]).setTaxaManutencao(ItauUtil.leitor.nextDouble());
			index++;
			break;
		case 3:
			contas[index] = new ContaSalario();
			cadastrarContaGenerica(contas[index]);
			System.out.print("Informe o dia de depósito do salário: ");
			((ContaSalario) contas[index]).setDiaDeposito(ItauUtil.leitor.nextInt());
			index++;
			break;
		default:
			break;
		}
	}

	private void cadastrarContaGenerica(Conta conta) {
		System.out.print("Informe o número da conta: ");
		conta.setNumeroConta(ItauUtil.leitor.nextInt());
		ItauUtil.leitor.nextLine();// remover quebra de linha
		System.out.print("Informe o nome do cliente: ");
		String nomeDoCliente = ItauUtil.leitor.nextLine();
		Cliente cliente = new Cliente();
		conta.setCliente(cliente);
		conta.getCliente().setNome(nomeDoCliente);
	}

	public void cadastrarTaxaRendimentoPoupanca() {
		System.out.print("Informe a taxa de rendimento: ");
		float taxaRendimento = ItauUtil.leitor.nextFloat();
		ContaPoupanca.setTaxaRendimento(taxaRendimento);
	}

	public void capitalizarPoupanca() {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i] instanceof IContaCaptalizavel) {
				System.out.println("Saldo antes de captalizar: " + contas[i].getSaldo());
				((IContaCaptalizavel) contas[i]).captalizar();
				System.out.println("Saldo depois de captalizar: " + contas[i].getSaldo());
			}
		}
		
	}

	public double recuperarSaldo(int numeroConta) {
		Conta conta = recuperarConta(numeroConta);
		return conta.getSaldo();
	}

	private Conta recuperarConta(int numeroConta) {
		Conta c = null;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].getNumeroConta() == numeroConta) {
				c = contas[i];
				break;
			}
		}
		return c;
	}

	public void depositar(int numeroConta) {
		System.out.print("Informe o valor a ser depositado: ");
		double valor = ItauUtil.leitor.nextDouble();
		Conta conta = recuperarConta(numeroConta);
		conta.depositar(valor);
	}

	public void sacar(int numeroConta) {
		System.out.print("Informe o valor a ser sacado: ");
		double valor = ItauUtil.leitor.nextDouble();
		// ocorre polimorfismo porque cada tipo de conta efetua um saque
		// diferente, neste ponto de codigo, pode agir de maneira diferente
		// de acordo com a instancia
		
		Conta conta = recuperarConta(numeroConta);
		conta.sacar(valor);
	}
	
	public void imprimirConta() {
		System.out.println(contas);
	}

	public void listarContas() {
		System.out.println("Contas:");
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				System.out.println("\t" + contas[i].getNumeroConta());
			}
		}
		System.out.println("\n");
		
	}

}
