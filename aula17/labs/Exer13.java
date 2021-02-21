package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e 
mostre o primeiro n�mero elevado ao segundo n�mero. N�o utilize a 
fun��o de pot�ncia da linguagem.*/

public class Exer13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a base:");
		int base = scan.nextInt();

		System.out.println("Entre com a pot�ncia");
		int pot = scan.nextInt();

		// 2^2 = 2 * 2
		// 2^3 = 2 * 2 * 2

		int resultado = base;

		for (int i = 1; i < pot; i++) {
			resultado *= base;
		}

		System.out.println("Resultado: " + resultado);

	}

}
