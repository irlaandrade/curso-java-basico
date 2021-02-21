package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

/*Fa�a  um  programa  que  receba  dois  n�meros  inteiros  e  gere  os 
n�meros inteiros que est�o no intervalo compreendido por eles.*/

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com outro n�mero inteiro:");
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
