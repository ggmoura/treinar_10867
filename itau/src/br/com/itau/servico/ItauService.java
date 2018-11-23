package br.com.itau.servico;

import br.com.itau.modelo.Cliente;
import br.com.itau.modelo.Conta;
import br.com.itau.modelo.ContaCorrente;
import br.com.itau.modelo.ContaPoupanca;
import br.com.itau.modelo.ContaSalario;
import br.com.itau.modelo.IContaCaptalizavel;
import br.com.itau.util.ItauUtil;

public class ItauService {

	private Conta contaGenerica;
	
	public void cadastrarConta(int tipoConta) {
		switch (tipoConta) {
		case 1:
			contaGenerica = new ContaPoupanca();
			cadastrarContaGenerica();
			break;
		case 2:
			contaGenerica = new ContaCorrente();
			cadastrarContaGenerica();
			System.out.print("Informe o valor da taxa de manutenção: ");
			((ContaCorrente)contaGenerica).setTaxaManutencao(ItauUtil.leitor.nextDouble());
			break;
		case 3:
			contaGenerica = new ContaSalario();
			cadastrarContaGenerica();
			System.out.print("Informe o dia de depósito do salário: ");
			((ContaSalario)contaGenerica).setDiaDeposito(ItauUtil.leitor.nextInt());
			break;
		default:
			break;
		}
	}
	
	private void cadastrarContaGenerica() {
		System.out.print("Informe o número da conta: ");
		contaGenerica.setNumeroConta(ItauUtil.leitor.nextInt());
		ItauUtil.leitor.nextLine();//remover quebra de linha
		System.out.print("Informe o nome do cliente: ");
		String nomeDoCliente = ItauUtil.leitor.nextLine();
		Cliente cliente = new Cliente();
		contaGenerica.setCliente(cliente);
		contaGenerica.getCliente().setNome(nomeDoCliente);
	}
	
	public void cadastrarTaxaRendimentoPoupanca() {
		System.out.print("Informe a taxa de rendimento: ");
		float taxaRendimento = ItauUtil.leitor.nextFloat();
		ContaPoupanca.setTaxaRendimento(taxaRendimento);
	}
	
	public void capitalizarPoupanca() {
		if (contaGenerica instanceof IContaCaptalizavel) {
			((IContaCaptalizavel) contaGenerica).captalizar();
		}
	}
	
	public double recuperarSaldo() {
		return this.contaGenerica.getSaldo();
	}

	public void depositar() {
		System.out.print("Informe o valor a ser depositado: ");
		double valor = ItauUtil.leitor.nextDouble();
		contaGenerica.depositar(valor);
	}

	public void sacar() {
		System.out.print("Informe o valor a ser sacado: ");
		double valor = ItauUtil.leitor.nextDouble();
		//ocorre polimorfismo porque cada tipo de conta efetua um saque
		//diferente, neste ponto de codigo, pode agir de maneira diferente
		//de acordo com a instancia
		contaGenerica.sacar(valor);
	}

}
