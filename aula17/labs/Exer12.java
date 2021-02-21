package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

/*Desenvolva  um  gerador  de  tabuada,  capaz  de  gerar  a  tabuada  de 
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual 
numero  ele  deseja  ver  a  tabuada.  A  saída  deve  ser  conforme  o 
exemplo abaixo: 
o  Tabuada de 5:  
o  5 X 1 = 5  
o  5 X 2 = 10  
o  ...  
o  5 X 10 = 50*/

public class Exer12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o número para gerar a tabuada:");
		int num = scan.nextInt();

		System.out.println("Tabuada de " + num + ":");

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}

	}

}
