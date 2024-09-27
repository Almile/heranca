package br.edu.fatecpg.pagamentos.model;

public class PagamentoDinheiro implements Pagamento {

		private double valor;
		private double result;
		public double getValor() {
			return this.valor;
		}
		
		public PagamentoDinheiro(double valor) {
			this.valor = valor;
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
		 result = valor * 0.90;
		}

		@Override
		public void emitirRecibo() {
			System.out.println("Pagamento em Dinheiro: R$" + result);
		}
		
}