package com.loiane.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ci�ncia da computa��o");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "sdgdsgdfg";
		String s2 = "sdgdsgdfg";
		
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Ci�ncia da computa��o");
		double[] notas2 = {9, 8, 6, 7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
		

	}

}
