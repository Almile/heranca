package br.edu.fatecpg.loja.view;

import br.edu.fatecpg.loja.model.Faxineiro;
import br.edu.fatecpg.loja.model.Gerente;

public class Main {

	public static void main(String[] args) {
		// teste funcionario | interfaces não podem ser instanciadas 
		//Funcionario func = new funcionario();
		
		// teste vendedor | classes abstratas não podem ser instanciadas 
		//Vendedor vend = new Vendedor();

		// teste faxineiro
		Faxineiro faxi = new Faxineiro();
		faxi.solicitarMaterial();
		// teste gerente
		Gerente ger = new Gerente();

		ger.baterPonto();
		ger.realizarVenda();
		ger.fecharCaixa();
		
	}

}
