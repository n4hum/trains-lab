package com.lab.trains;

/**
 * Created by dell on 17-07-2017.
 */
public class Arista {

    private Nodo inicial;
    private Nodo terminal;

    private int peso;


    public Arista(Nodo inicial, Nodo terminal, int peso) {
        this.inicial = inicial;
        this.terminal = terminal;
        this.peso = peso;

    }

    public Nodo getInicial() {
        return inicial;
    }

    public Nodo getTerminal() {
        return terminal;
    }

    public int getPeso() {
        return peso;
    }

}
