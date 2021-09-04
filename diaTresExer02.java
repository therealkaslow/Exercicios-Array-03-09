package br.generation.exercicios.eclipse.setembro;

import java.util.Scanner;

public class diaTresExer02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int arrayVetor[] = new int[10];
		int vezes = 0;
		int soma = 0;
		double media = 0;
		/*
		 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um
		 * programa que gere um vetor com os lançamentos, escreva esse vetor. A seguir
		 * determine e imprima a média aritmética dos lançamentos, contabilize e
		 * apresente também quantas foram as ocorrências da maior pontuação.
		 */

		for (int i = 0; i < 10; i++) {// loop do vetor
			System.out.println("Por Favor, Role o Dado Digitando um Numero:");// valor do dado
			arrayVetor[i] = leia.nextInt();// entrada do valor do dado
			soma = soma + arrayVetor[i];
			if (arrayVetor[i] > vezes) {// se o valor do vetor for menor que o valor anterior
				vezes = arrayVetor[i];
			}
		}
		media = soma / 10;
		System.out.println("apareceu:" + vezes + " e a media é:" + media);
		

		leia.close();

	}
}
