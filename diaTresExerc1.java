package br.generation.exercicios.eclipse.setembro;

import java.util.Scanner;

public class diaTresExerc1 {
public static void main(String[]args) {
/*1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/	
Scanner leia = new Scanner(System.in);	//scanner criado
	int arrayVetor[] = new int[5];//declarado cria��o de vetor e o num de posi��es
	int maior=0;
	for(int i=0; i < 5; i++ ) {//fun��o de loop for come�ando do 1 ao 5
	System.out.println("Por Favor, Digite o Numero da "+(i+1)+" � Posi��o");
	arrayVetor[i] = leia.nextInt();//capturado os dados da posi�ao pra colocar no vetor

	if (arrayVetor[i] > arrayVetor[0]){
		maior = arrayVetor[i];
	if (arrayVetor[i] > arrayVetor[1])
		maior = arrayVetor[i];			//System.out.println("A Maior Posi��o �: "+arrayVetor[i]);
	if (arrayVetor[i] > arrayVetor[2])
		maior = arrayVetor[i];			//System.out.println("A Maior Posi��o �: "+arrayVetor[i]);
	if (arrayVetor[i] > arrayVetor[3])
		maior = arrayVetor[i];			//System.out.println("A Maior Posi��o �: "+arrayVetor[i]);;
	}
	}
	//a minha mente � muito boa, em fazer l�gica dificil...
	System.out.println("A Maior Posi��o �: "+maior);

	
	
	
	
	leia.close();
}
}
