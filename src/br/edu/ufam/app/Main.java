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
		System.out.println("----------------------------------------------------------");
		System.out.println("Operações com Pilha:");

		System.out.println("\tEmpilhar: ");
		p.mostrarPilha();
		p.empilhar("Jordan");
		p.mostrarPilha();
		p.empilhar("Mikael");
		p.mostrarPilha();
		p.empilhar("Tupã");
		p.mostrarPilha();

		System.out.println("\tA pilha está fazia?");
		p.pilhaVazia();

		System.out.println("\tDesempilhando: ");
		p.mostrarPilha();
		p.desempilhar();
		p.mostrarPilha();
		p.desempilhar();
		p.mostrarPilha();
		p.desempilhar();
		p.mostrarPilha();
		System.out.println("----------------------------------------------------------");

		Lista l = new Lista();

	}

}
