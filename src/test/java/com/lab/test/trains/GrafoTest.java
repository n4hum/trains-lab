package com.lab.test.trains;
import com.lab.trains.Arista;
import com.lab.trains.Nodo;
import com.lab.trains.Grafo;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.CoderResult;

/**
 * Created by dell on 17-07-2017.
 */
public class GrafoTest {

    Nodo nodo1 = new Nodo("A");
    Nodo nodo2 = new Nodo("B");
    Arista arista = new Arista(nodo1, nodo2, 10);
    Grafo graf = new Grafo();


    @Test
    public void grafoInitTest() {
        Assert.assertEquals("A", nodo1.getNombre());
        Assert.assertEquals(10, arista.getPeso());
        Assert.assertEquals(true, graf.isEmpty());

    }


    @Test
    public void addAristaTest() {

        Nodo nodo3 = new Nodo("C");
        graf.addArista(nodo1, nodo3, 9);

/* pendiente  verificacion de arista */
    }
}

