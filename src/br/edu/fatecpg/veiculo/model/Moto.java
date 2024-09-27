package br.edu.fatecpg.veiculo.model;

public class Moto extends Veiculo{
	private int num_passageiros;
	private int velocidade;
	
	public Moto(String mod, String mrc, int ano, String cor, int num_pass, int veloc) {
		super(mod, mrc,ano,cor);
		this.num_passageiros = num_pass;
		this.velocidade = veloc;
	}
	
	// getters & setters
	public int getNumero_passageiros() {
		return this.num_passageiros;
	}
	public void setNumero_passageiros(int num_passageiros) {
		this.num_passageiros = num_passageiros;
	}

	public int getVelocidade() {
		return this.velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	// Metodos
	public void empinar() {
		System.out.println("Empinando... ram dam dam dam!!!!");
	}
	
	public void frear() {
		System.out.println("Freio com defeito :/");
		
	}
	
	
}
