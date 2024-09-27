package br.edu.fatecpg.autenticacao.view;
import br.edu.fatecpg.autenticacao.model.SistemaDeSeguranca;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	  SistemaDeSeguranca usuarioPadrao = new SistemaDeSeguranca();
	  usuarioPadrao.setUsuario("admin");
	  usuarioPadrao.setSenha("1234");

	  Scanner scanner = new Scanner(System.in);
	    
	  boolean response;
	  String usuario, senha;
	
	  do {
		System.out.print("Digite o nome de usuário: ");
	    usuario = scanner.nextLine();
	    
	    System.out.print("Digite a senha: ");
	    senha = scanner.nextLine();
	    
	    response = usuarioPadrao.login(usuario, senha);
	    
	   }while(!response);
	
	   if(response) {	        
	        System.out.print("Deseja fazer logout? (s/n): ");
	        String resposta = scanner.nextLine();
	        
	        if (resposta == "s") {
	        	usuarioPadrao.logout();
	        } 
	        else {
	            System.out.println("Você permaneceu logado.");
	        }        
	    }      
	    scanner.close();
	}
}
