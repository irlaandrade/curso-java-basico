package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia 
dos n�meros.*/

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		double media;
		int soma = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com um n�mero:");
			num = scan.nextInt();
			
			soma += num;
		}
		
		media = soma / 5;
		
		System.out.println("A soma �: " + soma);
		System.out.println("A m�dia �: " + media);
	}

}

