package com.lab.trains;

import java.util.ArrayList;
import java.util.List;


public class Nodo {

    private List<Arista> aristasIn;

    private List<Arista> aristasOut;

    private int visitado;

    private String nombre;

    public Nodo(String nombre) {
        aristasIn = new ArrayList();
        aristasOut = new ArrayList();
        this.nombre = nombre;
        this.visitado = 0;

    }

    public String getNombre() {
        return nombre;
    }


    public boolean addArista (Arista arnew) {
        if (arnew.getInicial() == this)
            aristasOut.add(arnew);
        else if (arnew.getTerminal() == this)
            aristasIn.add(arnew);
        else
            return false;
        return true;
    }

    public void addAristaOut (Nodo destino, int peso) {
        Arista out = new Arista(this, destino, peso);
        aristasOut.add(out);
    }

    public void addAristaIn (Nodo origen, int peso) {
        Arista in = new Arista(this, origen, peso);
        aristasIn.add(in);
    }

    public boolean hasAristas (Arista ar) {
       if ((ar.getInicial() == this ) || (ar.getTerminal() == this )) return true;
       else return false;
    }

}
