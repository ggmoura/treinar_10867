package br.com.itau.servico;

import java.util.Scanner;

import br.com.itau.modelo.Cliente;
import br.com.itau.modelo.Conta;

public class ItauService {

	private Conta conta;
	
	public void cadastrarConta() {
		conta = new Conta();
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o número da conta: ");
		conta.setNumeroConta(leitor.nextInt());
		leitor.nextLine();//remover quebra de linha
		System.out.print("Informe o nome do cliente: ");
		String nomeDoCliente = leitor.nextLine();
		Cliente cliente = new Cliente();
		conta.setCliente(cliente);
		conta.getCliente().setNome(nomeDoCliente);

	}
	
	public double recuperarSaldo() {
		return this.conta.getSaldo();
	}
	
	
	
}
