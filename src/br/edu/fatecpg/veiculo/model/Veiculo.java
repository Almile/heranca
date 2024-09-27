package br.edu.fatecpg.veiculo.model;

public class Veiculo {
	private String modelo;
	private String marca;
	private int ano;
	private String cor;
	
	public Veiculo(String mod, String mrc, int ano, String cor) {
		this.modelo = mod;
		this.marca = mrc;
		this.ano = ano;
		this.cor = cor;
		
	}
	
	// getters & setters
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String cor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	// Metodos
	public void ligar() {
		System.out.println("Ligando...");
		System.out.println("Ligado");
	}
	
	public void desligar() {
		System.out.println("Desligado");
	}
	
}
	
