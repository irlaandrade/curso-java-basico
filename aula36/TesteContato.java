package com.loiane.cursojava.aula36;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Ana");
		//contato.setEndereco("Kings Landing");
		//contato.setTelefone("81 9999-9999");
		
		//relacionamento tem-um endereco
		Endereco end = new Endereco();
		end.setNomeRua("Rua Azul");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("999999");
		
		contato.setEndereco(end);
		
		//relacionamento tem-um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("71");
		telefone.setNumero("99999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("71");
		telefone2.setNumero("4444-9999");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		//contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		// Teste sa�da no console
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}
}
