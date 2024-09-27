package br.edu.fatecpg.operacao.model;

public class Calculadora implements OperacaoMatematica {
	private double num1;
	private double num2;
	
	public Calculadora(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public double getNum1() {
		return this.num1;
	}
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return this.num2;
	}
	
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	
	@Override
	public double soma(double num1, double num2) {
		
		return num1 + num2;
	}

	@Override
	public double multiplicacao(double num1, double num2) {
	
		return num1 * num2;
	}

	@Override
	public double subtracao(double num1, double num2) {

		return num1 - num2;
	}

	@Override
	public double divisao(double num1, double num2) {
		
		return num1 / num2;
	}

}
