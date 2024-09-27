package br.edu.fatecpg.veiculo.model;

public class Caminhao extends Veiculo{
	private int suporte_carga;
	private String tipo_carga;
	
	public Caminhao(String mod, String mrc, int ano, String cor, int suporte, String tipo) {
		super(mod, mrc,ano,cor);
		this.suporte_carga = suporte;
		this.tipo_carga = tipo;
	}
	
	// getters & setters
	public int getSuporte_carga() {
		return this.suporte_carga;
	}
	public void setSuporte_carga(int suporte_carga) {
		this.suporte_carga = suporte_carga;
	}

	public String getTipo_carga() {
		return this.tipo_carga;
	}
	public void setTipo_carga(String tipo_carga) {
		this.tipo_carga = tipo_carga;
	}
	
	// Metodos
	 public void transportar() {
		 System.out.println("Transportando...");
	 }
	 
	 public void carregar() {
		 System.out.println("Caminhão carregado com sucesso.");
	 }
}

