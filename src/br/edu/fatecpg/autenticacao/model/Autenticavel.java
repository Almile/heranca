package br.edu.fatecpg.autenticacao.model;

public interface Autenticavel {
	public boolean login(String usuario, String senha);
	
	public void logout();
}
