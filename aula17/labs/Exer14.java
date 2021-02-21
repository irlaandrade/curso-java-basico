package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre a 
quantidade de n�meros pares e a quantidade de n�meros impares.*/

public class Exer14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;
		int pares = 0;
		int impares = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("Entre com um n�mero:");
			num = scan.nextInt();

			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("Pares: " + pares);
		System.out.println("�mpares: " + impares);

	}

}
