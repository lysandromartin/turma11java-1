package aplicacoes;

import java.util.Scanner;

public class Lista1Exercicio8 {
	public static void main (String [] args) {
	/*
	8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do 
	distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do 
	distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de 
	f�brica de um carro e escreva o custo ao consumidor. 
	*/
		
		//variaveis
		double percDistribuidor = 28, perImposto = 45, custoFabrica = 0, 
		valorImposto = 0, valorDistribuidor = 0,custoConsumidor = 0;
		
		//input
		Scanner tec = new Scanner(System.in);
		System.out.print("Insira o valor do custo de fabrica do carro: ");
		custoFabrica = tec.nextDouble();
		
		//calculo
		valorImposto = (custoFabrica*perImposto)/100;
		valorDistribuidor = (custoFabrica*perImposto)/100;
		custoConsumidor = custoFabrica + valorDistribuidor + valorImposto;
		
		//saida
		System.out.printf("O custo do consumidor � R$ %.2f reais", custoConsumidor);
	}

}
