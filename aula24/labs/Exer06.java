package com.loiane.cursojava.aula24.labs;

public class Exer06 {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		contato1.nome = "Claudia";
		contato1.endereco = "Av. Recife, 100";
		contato1.email = "claudia@email.com";
		
		contato1.telefones = new String[5];
		contato1.telefones[0] = "99999-9999";
		contato1.telefones[1] = "99999-9998";
		contato1.telefones[2] = "99999-9997";

	}

}
