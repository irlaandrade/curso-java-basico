package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

/* Faça  um  programa  que  calcule  o  mostre  a  média  aritmética  de  N 
notas.*/

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o total de notas:");
		int notas = scan.nextInt();
		
		double soma = 0;
		double media;
		double nota;
		
		for (int i = 0; i < notas; i++) {
			System.out.println("Digite a nota " + (i + 1));
			nota = scan.nextDouble();
			
			soma += nota;
		}
		
		media = soma / notas;
		
		System.out.println("A média é: " + media);
	}
}
