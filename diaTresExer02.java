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
		 * 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um
		 * programa que gere um vetor com os lan�amentos, escreva esse vetor. A seguir
		 * determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e
		 * apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
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
		System.out.println("apareceu:" + vezes + " e a media �:" + media);
		

		leia.close();

	}
}
