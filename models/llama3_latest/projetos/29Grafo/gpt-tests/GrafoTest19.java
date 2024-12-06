package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest19{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        assertTrue(grafo.existeAresta(0, 1));
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo(5);
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 1);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(1, aresta.peso());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        Grafo.Aresta aresta = grafo.primeiroListaAdj(0);
        aresta = grafo.proxAdj(0);
        assertEquals(0, aresta.v1());
        assertEquals(2, aresta.v2());
        assertEquals(2, aresta.peso());
    }

    @Test
    public void testRetiraAresta() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
        assertEquals(0, aresta.v1());
        assertEquals(1, aresta.v2());
        assertEquals(1, aresta.peso());
        assertFalse(grafo.existeAresta(0, 1));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 2);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 0));
    }
}