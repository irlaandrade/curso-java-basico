package com.loiane.cursojava.aula27.labs;
/*Escreva�um a�classe�para�representar�uma�l�mpada.
 *Desenvolva�m�todos para�ligar,�desligar�a�lampada.*/
public class Exer01 {
	
	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		
		lampada.mostrarEstado();
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
	}
}
