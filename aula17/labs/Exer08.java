package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

/*Faça um programa que leia 5 números e informe a soma e a média 
dos números.*/

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		double media;
		int soma = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com um número:");
			num = scan.nextInt();
			
			soma += num;
		}
		
		media = soma / 5;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);
	}

}

