package br.com.itau.servico;

import br.com.itau.modelo.Cliente;
import br.com.itau.modelo.Conta;
import br.com.itau.util.ItauUtil;

public class ItauService {

	private Conta conta;
	
	public void cadastrarConta() {
		conta = new Conta();
		System.out.print("Informe o número da conta: ");
		conta.setNumeroConta(ItauUtil.leitor.nextInt());
		ItauUtil.leitor.nextLine();//remover quebra de linha
		System.out.print("Informe o nome do cliente: ");
		String nomeDoCliente = ItauUtil.leitor.nextLine();
		Cliente cliente = new Cliente();
		conta.setCliente(cliente);
		conta.getCliente().setNome(nomeDoCliente);

	}
	
	public double recuperarSaldo() {
		return this.conta.getSaldo();
	}

	public void depositar() {
		System.out.print("Informe o valor a ser depositado: ");
		double valor = ItauUtil.leitor.nextDouble();
		conta.depositar(valor);
	}
	
	
	
}
