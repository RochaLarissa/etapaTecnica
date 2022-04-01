package Questao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Deseja criar um vetor com quantas posicoes?");
		int N = sc.nextInt();
		
		int[] vetor = new int[N];
		for (int i = 0; i < N; i++) {
			vetor[i] = sc.nextInt();
		}
		
		//pares e impares
		int pares = 0;
		int impares = 0;
		for (int i = 0; i < N; i++) {
			if (vetor[i] % 2 == 0) {
				pares++;
			}
			else {
				impares++;
			}
		}
		
		
		//qtd de repetidos e quais sao
		int qtdRepetidos = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				if (vetor[i] == vetor[j]) {
					qtdRepetidos++;
					System.out.println(vetor[i]);
				}
			}
		}
		

	}

}
