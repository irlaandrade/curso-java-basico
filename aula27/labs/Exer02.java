package com.loiane.cursojava.aula27.labs;

/*Cria�uma�classe�para�representar�uma�conta�corrente�que�possui�um n�mero,�um�saldo,�um�status�que�informa	
 �se�ela��especial�ou�n�o,	um limite. Desenvolva�m�todos�para�realizar�saque�(verificando�se�o�cliente pode�realizar	
 �saques), despositar�dinheiro,�consultar�saldo�e�verificar�se�o cliente�est�usando�cheque�especial�ou�n�o.�Desenvolva	
 �um�programa para�testar�essa�classe.*/
public class Exer02 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = -10;
		
		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			conta.consultarSaldo();
		} else {
			System.out.println("N�o foi poss�vel realizar saque. Saldo insuficiente.");
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de R$500.");
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			conta.consultarSaldo();
		} else {
			System.out.println("N�o foi poss�vel realizar saque. Saldo insuficiente.");
		}
		
		System.out.println("Dep�sito de R$500.");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Est� usando cheque especial.");
		} else {
			System.out.println("N�o est� usando cheque especial.");
		}
		
		conta.realizarSaque(600);
		conta.consultarSaldo();
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Est� usando cheque especial.");
		} else {
			System.out.println("N�o est� usando cheque especial.");
		}
	}

}
