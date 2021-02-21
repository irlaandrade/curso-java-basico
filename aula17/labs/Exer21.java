package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

/* Fa�a um programa que calcule o n�mero m�dio de alunos por turma. 
Para isto, pe�a a quantidade de turmas e a quantidade de alunos para 
cada turma. As turmas n�o podem ter mais de 40 alunos.*/

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de turmas:");
        int numTurmas = scan.nextInt();
        
        int numAlunos;
        int soma = 0;
        boolean invalido = true;
        
        for (int i = 1; i <= numTurmas; i++){
            
            invalido = true;
            do {
                System.out.println("Digite o n�mero de alunos da turma: " + i);
                numAlunos = scan.nextInt();

                if (numAlunos <= 40){
                    invalido = false;
                } else {
                    System.out.println("N�mero de alunos inv�lido. Digite novamente.");
                }
            }while (invalido);
            
            soma += numAlunos;
        }
        
        double media = soma / numTurmas;
        
        System.out.println("M�dia: " + media);

	}

}
