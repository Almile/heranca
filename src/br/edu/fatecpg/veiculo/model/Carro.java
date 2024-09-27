package br.edu.fatecpg.veiculo.model;

public class Carro extends Veiculo {
	private int num_passageiros;
	private String tipo;
	
	public Carro(String mod, String mrc, int ano, String cor, int num_pass, String tipo) {
		super(mod, mrc,ano,cor);
		this.num_passageiros = num_pass;
		this.tipo = tipo;
	}
	
	// getters & setters

	public int getNum_passageiros() {
		return this.num_passageiros;
	}
	public void setNum_passageiros(int num_passageiros) {
		this.num_passageiros = num_passageiros;
	}

	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	// Metodos
	public void acelerar() {
		System.out.println("Acelerou");
	}
	
	public void ligarAr() {
		System.out.println("Ar ligado");
	}
}
