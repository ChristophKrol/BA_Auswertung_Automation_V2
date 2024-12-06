package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.BuscaEmLargura;
import ds.Grafo;

public class GrafoTest27{


    @Test
    public void testBuscaEmLargura() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 1);
        grafo.insereAresta(1, 3, 1);
        grafo.insereAresta(2, 4, 1);

        BuscaEmLargura busca = new BuscaEmLargura(grafo);
        busca.buscaEmLargura();

        assertEquals(0, busca.d(0));
        assertEquals(1, busca.d(1));
        assertEquals(1, busca.d(2));
        assertEquals(2, busca.d(3));
        assertEquals(2, busca.d(4));

        assertEquals(-1, busca.antecessor(0));
        assertEquals(0, busca.antecessor(1));
        assertEquals(0, busca.antecessor(2));
        assertEquals(1, busca.antecessor(3));
        assertEquals(2, busca.antecessor(4));
    }
}