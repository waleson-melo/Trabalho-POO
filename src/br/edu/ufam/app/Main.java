package br.edu.ufam.app;

import br.edu.ufam.algo.Fila;
import br.edu.ufam.algo.Lista;
import br.edu.ufam.algo.Pilha;

/**
 * @author Waleson_Melo
 */
public class Main {

	public static void main(String[] args) {
		Fila f = new Fila();
		System.out.println("----------------------------------------------------------");
		System.out.println("Operações com Fila:");

		System.out.println("\tEnfileirando: ");
		f.mostrarFila();
		f.enfileirar("Jordan");
		f.mostrarFila();
		f.enfileirar("Mikael");
		f.mostrarFila();
		f.enfileirar("Tupã");
		f.mostrarFila();

		System.out.println("\tPrimeiro e Ultimo da fila respectivamente: ");
		f.primeiroFila();
		f.ultimoFila();

		System.out.println("\tDesenfileirando: ");
		f.mostrarFila();
		f.desenfileirar();
		f.mostrarFila();
		f.desenfileirar();
		f.mostrarFila();
		f.desenfileirar();
		f.mostrarFila();
		System.out.println("----------------------------------------------------------");

		Pilha p = new Pilha();
		
		Lista l = new Lista();

	}

}
