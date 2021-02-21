package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

/*Faça  um  programa  que  receba  dois  números  inteiros  e  gere  os 
números inteiros que estão no intervalo compreendido por eles.*/

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com outro número inteiro:");
		int num2 = scan.nextInt();
		
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = num1; i >= num2; i--) {
				System.out.println(i);
			}
		}
	}
}
