package com.loiane.cursojava.aula17.labs;

/*Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma 
mensagem  caso  o  valor  seja  inv�lido  e  continue  pedindo  at�  que  o 
usu�rio informe um valor v�lido.*/

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Entre com uma nota");
			double nota = scan.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Voc� digitou: " + nota);
			} else {
				//notaValida = false;
				System.out.println("Nota inv�lida, digite novamente.");
			}
			
		} while (!notaValida);
	}
}
