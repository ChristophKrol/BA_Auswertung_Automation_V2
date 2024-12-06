import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrafoTest{


// Test Method: testInsereAresta
@Test
void testInsereAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    assertEquals(5, grafo.mat[0][1]);
}


// Test Method: testExisteAresta
@Test
void testExisteAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    assertTrue(grafo.existeAresta(0, 1));
}


// Test Method: testListaAdjVazia
@Test
void testListaAdjVazia() {
    Grafo grafo = new Grafo();
    assertTrue(grafo.listaAdjVazia(0));
}


// Test Method: testPrimeiroListaAdj
@Test
void testPrimeiroListaAdj() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    assertEquals(new Aresta(0, 1, 5), grafo.primeiroListaAdj(0));
}


// Test Method: testProxAdj
@Test
void testProxAdj() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    assertEquals(new Aresta(0, 1, 5), grafo.proxAdj(0));
}


// Test Method: testRetiraAresta
@Test
void testRetiraAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    assertEquals(new Aresta(0, 1, 5), grafo.retirarAresta(0, 1));
}


// Test Method: testImprime
@Test
void testImprime() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    grafo.imprime();
}


// Test Method: testGrafoTransposto
@Test
void testGrafoTransposto() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 5);
    assertEquals(new Grafo(), grafo.grafoTransposto());
}


}