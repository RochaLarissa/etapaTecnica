package Questao4;

import java.util.Scanner;

import Questao3.Pessoa;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Criando um animal:");
		System.out.println("Informe a classe: (anfibio, reptil, ave ou mamifero),");
		String classe = sc.next();
		System.out.println("Informe a alimentação: (herbivoro,onivoro ou carnivoro)");
		String alimentacao = sc.next();
		System.out.println("Informe o habitat: (aereo, terrestre, aquatico ou multi");
		String habitat = sc.next();

		if (classe.equalsIgnoreCase("anfibio")) {
			Anfibio anfibio1 = new Anfibio(classe, alimentacao, habitat);
		} else if (classe.equalsIgnoreCase("ave")) {
			Ave ave1 = new Ave(classe, alimentacao, habitat);
		} else if (classe.equalsIgnoreCase("ave")) {
			Mamifero mamifero1 = new Mamifero(classe, alimentacao, habitat);
		} else if (classe.equalsIgnoreCase("reptil")) {
			Reptil reptil1 = new Reptil(classe, alimentacao, habitat);
		}
		
		

		
	}

}
