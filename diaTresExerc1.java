package br.generation.exercicios.eclipse.setembro;

import java.util.Scanner;

public class diaTresExerc1 {
public static void main(String[]args) {
/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/	
Scanner leia = new Scanner(System.in);	//scanner criado
	int arrayVetor[] = new int[5];//declarado criação de vetor e o num de posições
	int maior=0;
	for(int i=0; i < 5; i++ ) {//função de loop for começando do 1 ao 5
	System.out.println("Por Favor, Digite o Numero da "+(i+1)+" º Posição");
	arrayVetor[i] = leia.nextInt();//capturado os dados da posiçao pra colocar no vetor

	if (arrayVetor[i] > arrayVetor[0]){
		maior = arrayVetor[i];
	if (arrayVetor[i] > arrayVetor[1])
		maior = arrayVetor[i];			//System.out.println("A Maior Posição é: "+arrayVetor[i]);
	if (arrayVetor[i] > arrayVetor[2])
		maior = arrayVetor[i];			//System.out.println("A Maior Posição é: "+arrayVetor[i]);
	if (arrayVetor[i] > arrayVetor[3])
		maior = arrayVetor[i];			//System.out.println("A Maior Posição é: "+arrayVetor[i]);;
	}
	}
	//a minha mente é muito boa, em fazer lógica dificil...
	System.out.println("A Maior Posição é: "+maior);

	
	
	
	
	leia.close();
}
}
