
package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.Grafo;

public class GrafoTest3 {

    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(2, 4, 3);
        assertTrue(grafo.existeAresta(0, 1));
        assertTrue(grafo.existeAresta(0, 2));
        assertTrue(grafo.existeAresta(1, 3));
        assertTrue(grafo.existeAresta(2, 4));
        assertFalse(grafo.existeAresta(0, 3));
        assertFalse(grafo.existeAresta(1, 2));
        assertFalse(grafo.existeAresta(3, 4));
    }

    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(2, 4, 3);
        assertFalse(grafo.existeAresta(0, 3));
        Aresta aresta = grafo.retiraAresta(1, 3);
        assertEquals(8, aresta.peso());
        assertFalse(grafo.existeAresta(1, 3));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 10);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(2, 4, 3);
        Aresta aresta = grafo.primeiroListaAdj(0);
        assertNotNull(aresta);
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(2, 4, 3);
        Aresta aresta = grafo.proxAdj(0);
        assertNotNull(aresta);
        assertEquals(2, aresta.v2());
        assertEquals(5, aresta.peso());
        aresta = grafo.proxAdj(0);
        assertNotNull(aresta);
        assertEquals(1, aresta.v2());
        assertEquals(10, aresta.peso());
        aresta = grafo.proxAdj(0);
        assertNull(aresta);
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 10);
        grafo.insereAresta(0, 2, 5);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(2, 4, 3);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
        assertTrue(grafoT.existeAresta(3, 1));
        assertTrue(grafoT.existeAresta(4, 2));
        assertFalse(grafoT.existeAresta(3, 2));
        assertFalse(grafoT.existeAresta(2, 1));
        assertFalse(grafoT.existeAresta(4, 3));
    }
}