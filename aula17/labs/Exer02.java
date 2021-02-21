package com.loiane.cursojava.aula17.labs;

/*Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o 
aceite a senha igual ao nome do usu�rio, mostrando uma mensagem 
de erro e voltando a pedir as informa��es.*/

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		String nomeUser;
		String senha;
		
		do {
			System.out.println("Entre com o nome do usu�rio:");
			nomeUser = scan.next();
			
			System.out.println("Entre com a senha:");
			senha = scan.next();
			
			if (nomeUser.equalsIgnoreCase(senha)) {
				//infoValidas = false;
				System.out.println("Senha igual ao usu�rio. Digite novamente.");
			} else {
				infoValidas = true;
				System.out.println("Senha e usu�rios v�lidos.");
			}
			
		} while (!infoValidas);
	}
}
