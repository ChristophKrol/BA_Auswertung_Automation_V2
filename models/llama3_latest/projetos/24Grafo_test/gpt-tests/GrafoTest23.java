package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class GrafoTest23{


    @Test
    public void testInsereAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertEquals(5, grafo.mat[0][1]);
    }

    @Test
    public void testExisteAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        assertTrue(grafo.existeAresta(0, 1));
        assertFalse(grafo.existeAresta(1, 0));
    }

    @Test
    public void testListaAdjVazia() {
        Grafo grafo = new Grafo();
        assertTrue(grafo.listaAdjVazia(0));
        grafo.insereAresta(0, 1, 5);
        assertFalse(grafo.listaAdjVazia(0));
    }

    @Test
    public void testPrimeiroListaAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Aresta primeiraAresta = grafo.primeiroListaAdj(0);
        assertEquals(0, primeiraAresta.v1());
        assertEquals(1, primeiraAresta.v2());
        assertEquals(5, primeiraAresta.peso());
    }

    @Test
    public void testProxAdj() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(0, 2, 10);
        Aresta primeiraAresta = grafo.primeiroListaAdj(0);
        Aresta proximaAresta = grafo.proxAdj(0);
        assertEquals(0, proximaAresta.v1());
        assertEquals(2, proximaAresta.v2());
        assertEquals(10, proximaAresta.peso());
    }

    @Test
    public void testRetiraAresta() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        Aresta aresta = grafo.retiraAresta(0, 1);
        assertNull(aresta);
        assertFalse(grafo.existeAresta(0, 1));
    }

    @Test
    public void testGrafoTransposto() {
        Grafo grafo = new Grafo();
        grafo.insereAresta(0, 1, 5);
        grafo.insereAresta(1, 2, 10);
        Grafo grafoT = grafo.grafoTransposto();
        assertTrue(grafoT.existeAresta(1, 0));
        assertTrue(grafoT.existeAresta(2, 1));
        assertEquals(5, grafoT.mat[1][0]);
        assertEquals(10, grafoT.mat[2][1]);
    }
}