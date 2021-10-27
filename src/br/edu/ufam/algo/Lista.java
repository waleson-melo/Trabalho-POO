package br.edu.ufam.algo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author waleson_melo
 */
public class Lista {
    private Collection<String> lista = new ArrayList<>();

    public void inserirLista(String valor) {
        this.lista.add(valor);
    }

    public void removerLista(String valor) {
        if (this.lista.contains(valor)) {
            this.lista.remove(valor);
        } else {
            System.out.println("\t\tElemento não removido da lista");
        }
    }

    public void mostrarLista() {
        System.out.println("\t\t" + this.lista);
    }

    public void listaVazia() {
        if (this.lista.isEmpty()) {
            System.out.println("\t\tLista vazia");
        } else {
            System.out.println("\t\tLista não vazia");
        }
    }
}
