package Questao3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe nome:");
		String nome1 = sc.next();
		System.out.println("Informe sexo:");
		String sexo1 = sc.next();
		System.out.println("Informe data de nascimento:");
		String data1 = sc.next();

		Pessoa p1 = new Pessoa(nome1, sexo1, data1);
		
		p1.imprimeTempoVidaRestante();
	}

}
