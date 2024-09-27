package br.edu.fatecpg.pagamentos.model;

public class PagamentoCartao implements  Pagamento {
	private double valor;
	private double result;
	public PagamentoCartao(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getResult() {
		return this.result;
	}
	
	public void setResult(double result) {
		this.result = result;
	}
	@Override
	public void calcularPagamento() {
	 result = valor * 1.05;
	}

	@Override
	public void emitirRecibo() {
		System.out.println("Pagamento em Cartão: R$" + result);
	}

}
