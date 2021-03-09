package com.loiane.cursojava.aula43.labs;

public class Exer01 {

	public static void main(String[] args) {

		System.out.println("*** Teste ContaBancaria ***");

		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente conta simples");
		contaSimples.setNumConta("11111");

		contaSimples.depositar(100);

		realizarSaque(contaSimples, 50);

		realizarSaque(contaSimples, 70);

		System.out.println(contaSimples);

		System.out.println("*** Teste ContaPoupan�a ***");

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente conta poupan�a");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setDiaRendimento(2);

		contaPoupanca.depositar(100);

		realizarSaque(contaPoupanca, 50);

		realizarSaque(contaPoupanca, 70);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo � de = " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje n�o � dia de rendimento, novo saldo n�o calculado.");
		}

		System.out.println(contaPoupanca);
		
		System.out.println("*** Teste ContaEspecial ***");

		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente conta especial");
		contaEspecial.setNumConta("33333");
		contaEspecial.setLimite(50);

		contaEspecial.depositar(100);

		realizarSaque(contaEspecial, 50);

		realizarSaque(contaEspecial, 70);
		
		realizarSaque(contaEspecial, 80);

		System.out.println(contaEspecial);

	}

	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
		}
	}

}
