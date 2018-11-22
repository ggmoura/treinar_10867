package br.com.itau.visao;

import java.util.Scanner;

import br.com.itau.servico.ItauService;

public class TelaMenu {

	private ItauService service;
	
	public TelaMenu() {
		this.service = new ItauService();
	}
	
	public void iniciarAtendimento() {
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.print("Informe:\n\t1 - Criar Conta\n\t2 - Exibir saldo\n\t0 - Sair\n=> ");
			opcao = leitor.nextInt();
			switch (opcao) {
			case 1:
				cadastrarConta();
				break;
			case 2:
				System.out.println("Exibe saldo");
				break;
			case 0:
				System.out.println("###### Saiu do sistema! ######");
				break;
			default:
				System.out.println("###### Opção Inválida ######");
				break;
			}

		} while (opcao != 0);
		leitor.close();
	}

	private void cadastrarConta() {
		service.cadastrarConta();
	}

}
