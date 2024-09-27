package br.edu.fatecpg.pagamentos.view;

import br.edu.fatecpg.pagamentos.model.PagamentoCartao;
import br.edu.fatecpg.pagamentos.model.PagamentoDinheiro;

public class Main {

	public static void main(String[] args) {
		double valor = 100;
		
	    PagamentoCartao cartao = new PagamentoCartao(valor);
		cartao.calcularPagamento();
		cartao.emitirRecibo();
	
		PagamentoDinheiro dinheiro = new PagamentoDinheiro(valor);
		dinheiro.calcularPagamento();
		dinheiro.emitirRecibo();
	
	}

}
