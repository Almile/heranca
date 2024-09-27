package br.edu.fatecpg.operacao.view;
import java.util.Scanner;

import br.edu.fatecpg.operacao.model.Calculadora;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" 1-Soma \n 2-Multiplicação \n 3-Divisão \n 4-Subtração \n Digite a operação: ");
		int op = scan.nextInt();
		System.out.println("Digite o primeiro número: ");
		double n1 = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		double n2 = scan.nextDouble();
		
		Calculadora calc = new Calculadora(n1, n2);

		switch(op) {
		case 1:
			System.out.println(calc.soma(n1, n2)); 
			break;
		case 2:
			System.out.println(calc.multiplicacao(n1, n2)); 
			break;
		case 3:
			System.out.println(calc.divisao(n1, n2)); 
			break;
		case 4:
			System.out.println(calc.subtracao(n1, n2)); 
			break;
		default:
			System.out.println("Opção invalida!"); 
			break;
		}
	}

}
