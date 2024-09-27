package br.edu.fatecpg.autenticacao.model;

public class SistemaDeSeguranca implements Autenticavel{
	private String usuario;
	private String senha;
    private boolean autenticado = false;


	public String getUsuario() {
		return this.usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
    
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}    
    
	@Override
	public boolean login(String user, String pass) {
	  if (usuario.equals(user) && senha.equals(pass)) {
            autenticado = true;
            System.out.println("Login bem-sucedido! Bem-vindo, " + usuario + "!");
        } else {
            System.out.println("Usuário ou senha incorretos. Tente novamente.");
        }
        return autenticado;		
	}

	@Override
	public void logout() {
       autenticado = false;
       System.out.println("Logout realizado com sucesso!");	
	}
}
