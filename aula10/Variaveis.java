package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//convenção Java:
		int idade = 28;
		String nome = "Irla";
		String nomeDoMeuCachorro = "Cacau";
		String ano2021 = "2021";
		
		//aceito, mas não utilizado:
		int _idade;
		int $idade;
		
		//não é convenção Java:
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		//String nomeDoMeuCachorro;
		
		idade = 27;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);

		//má prática:
		int a = 10;
		String b = "Irla";
		
	}

}
