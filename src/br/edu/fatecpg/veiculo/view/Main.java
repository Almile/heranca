package br.edu.fatecpg.veiculo.view;

import br.edu.fatecpg.veiculo.model.Caminhao;
import br.edu.fatecpg.veiculo.model.Carro;
import br.edu.fatecpg.veiculo.model.Moto;

public class Main {
	public static void main(String[] args) {
		// carro
		Carro carro = new Carro("Renaut","Logan", 2015, "Prata", 5,"Sedan") ;
				
		carro.ligar();
		carro.desligar();
		
		carro.ligarAr();
		carro.acelerar();
		
		// moto
		Moto moto = new Moto("Twister", "Honda", 2020, "Vermelha",2,  150);
		
		moto.ligar();
		moto.empinar();
		moto.frear();
		moto.desligar();
		
		//Caminhao
		Caminhao caminhao = new Caminhao("Mercedes", "1620", 2012, "Preto", 20, "Papel");
		
		caminhao.carregar();
		caminhao.ligar();
		caminhao.transportar();
		caminhao.desligar();
		
	}

	
}
