package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

/*A  s�rie  de  Fibonacci  �  formada  pela  seq��ncia 
1,1,2,3,5,8,13,21,34,55,...  Fa�a  um  programa  capaz  de  gerar  a  s�rie 
at� o n �simo termo.*/

public class Exer15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o n-�simo termo da s�rie de fibonacci:");
		int n = scan.nextInt();

		int primeiro = 1;
		int segundo = 1;
		int proximo;

		System.out.println(primeiro);
		System.out.println(segundo);

		// 1,1,2,3,5
		// primeiro = 1
		// segundo = 2
		// proximo = 3

		for (int i = 3; i <= n; i++) {

			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			System.out.println(proximo);
		}
	}

}
