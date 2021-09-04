package br.generation.exercicios.eclipse.setembro;

import java.util.Scanner;

public class DiatresExerQuatro {
public static void main(String[]args) {
/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
Scanner leia = new Scanner(System.in);
	float[][] x = new float [3][3];
	float[][] y = new float [3][3];
	int l=0, c=0;
	for( l = 0; l < 3;l++) {
		for( c =0; c < 3;c++) {
			System.out.println("Insira o Valor para Fazer uma Soma");
				x[l][c] = leia.nextFloat();
					//calculo soma diagonal....
				if (x[l][c] == x[l][c]) {
					
				}
	}
	}
leia.close();	
}
}
