package com.lab.trains;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 17-07-2017.
 */
public class Grafo {

    private List<Nodo> nodos;

    private List<Arista> aristas;

    public Grafo() {
        this.nodos = new ArrayList<Nodo>();
        this.aristas = new ArrayList<Arista>();

    }

    public boolean isEmpty() {
        return (nodos.size() == 0);
    }

    public int tamano() {

        return nodos.size();
    }


    public List<Arista> getAristas() {
        return this.aristas;

    }

    public Nodo getNodo(int i) {
        return nodos.get(i);
    }

    public List<Nodo> getNodos() {
        return nodos;
    }



    public boolean addNodo(Nodo n) {

        boolean confirmacion = false;
        if (!nodos.contains(n)) {
            confirmacion = nodos.add(n);
        }
        return confirmacion;
    }

    public boolean addArista(Nodo origen, Nodo destino, int peso) {
        if (!nodos.contains(origen) || !nodos.contains(destino)) throw new IllegalArgumentException("Nodo no se encuentra en el grafo");
        Arista arnew = new Arista(origen, destino, peso);
        return true;
    }


}

