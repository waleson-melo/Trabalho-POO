package br.edu.ufam.algo;

import java.util.Stack;

/**
 * @author waleson_melo
 */
public class Pilha {
    private Stack<String> pilha = new Stack<>();

    public void empilhar(String valor) {
        this.pilha.push(valor);
    }

    public void desempilhar() {
        this.pilha.pop();
    }

    public void mostrarPilha() {
        System.out.println("\t\t" + this.pilha);
    }

    public void pilhaVazia() {
        if (this.pilha.isEmpty()) {
            System.out.println("\t\tPilha vazia");
        } else {
            System.out.println("\t\tPilha não vazia");
        }
    }

}
