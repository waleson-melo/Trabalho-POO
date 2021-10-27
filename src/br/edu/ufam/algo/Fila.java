package br.edu.ufam.algo;

import java.util.LinkedList;

/**
 * @author waleson_melo
 */
public class Fila {
    private LinkedList<String> fila = new LinkedList<>();

    public void enfileirar(String valor) {
        this.fila.add(valor);
    }

    public void desenfileirar() {
        this.fila.remove();
    }

    public void mostrarFila() {
        System.out.println("\t\t" + this.fila);
    }

    public void primeiroFila() {
        System.out.println("\t\t" + this.fila.getFirst());
    }

    public void ultimoFila() {
        System.out.println("\t\t" + this.fila.getLast());
    }
}
