package com.lab.test.trains;

import com.lab.trains.Arista;
import com.lab.trains.Nodo;
import org.junit.Test;

/**
 * Created by dell on 17-07-2017.
 */
public class NodoTest {
    @Test
    public void nodoInitTest() throws Exception {
        Nodo n1 = new Nodo("A");
        Nodo n2 = new Nodo ("B");
        Nodo n3 = new Nodo ("C");
        Nodo n4 = new Nodo ("D");
        Arista ar1 = new Arista(n1, n2, 10);
        Arista ar2 = new Arista(n1, n3, 9);
        Arista ar3 = new Arista(n3, n4, 8);
        Arista ar4 = new Arista(n4, n1, 7);

    }
}
