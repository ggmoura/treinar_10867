package br.com.itau.visao;

import br.com.itau.servico.ItauService;
import br.com.itau.util.ItauUtil;

public class TelaMenu {

	private ItauService service;
	
	public TelaMenu() {
		this.service = new ItauService();
	}
	
	public void iniciarAtendimento() {
		int opcao = 0;
		do {
			imprimirMenu();
			opcao = ItauUtil.leitor.nextInt();
			switch (opcao) {
			case 1:
				cadastrarConta();
				break;
			case 2:
				exibirSaldo();
				break;
			case 3:
				depositar();
				break;
			case 0:
				System.out.println("###### Saiu do sistema! ######");
				break;
			default:
				System.out.println("###### Opção Inválida ######");
				break;
			}

		} while (opcao != 0);
	}

	private void depositar() {
		service.depositar();
		double novoSaldo = service.recuperarSaldo();
		System.out.println("Deposito efetuado com sucesso\nNovo saldo: " + novoSaldo);
	}

	private void exibirSaldo() {
		double saldo = service.recuperarSaldo();
		System.out.println("Saldo atual: " + saldo);
	}

	private void cadastrarConta() {
		service.cadastrarConta();
		System.out.println("Conta cadastrada com sucesso!");
	}
	
	private void imprimirMenu() {
		System.out.print("Informe:\n\t"
				+ "1 - Criar Conta\n\t"
				+ "2 - Exibir saldo\n\t"
				+ "3 - Depositar\n\t"
				+ "0 - Sair\n=> ");
	}
}
