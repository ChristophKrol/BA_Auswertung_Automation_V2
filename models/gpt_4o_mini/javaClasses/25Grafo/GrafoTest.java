import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrafoTest{


// Test Method: testInsereAresta
@Test
public void testInsereAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    // Verify if the edge was added
    assertTrue(grafo.existeAresta(0, 1));
}


// Test Method: testExisteAresta
@Test
public void testExisteAresta() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(2, 3, 5);
    assertTrue(grafo.existeAresta(2, 3));
    assertFalse(grafo.existeAresta(3, 2)); // Check reverse edge
}


// Test Method: testListaAdjVazia
@Test
public void testListaAdjVazia() {
    Grafo grafo = new Grafo();
    assertTrue(grafo.listaAdjVazia(0)); // Should be empty initially
    grafo.insereAresta(0, 1, 10);
    assertFalse(grafo.listaAdjVazia(0)); // After adding, should not be empty
}


// Test Method: testPrimeiroListaAdj
@Test
public void testPrimeiroListaAdj() {
    Grafo grafo = new Grafo();
    Aresta aresta;
    grafo.insereAresta(1, 2, 10);
    aresta = grafo.primeiroListaAdj(1);
    assertNotNull(aresta);
    assertEquals(1, aresta.v1());
    assertEquals(2, aresta.v2());
    assertEquals(10, aresta.peso());
    assertNull(grafo.primeiroListaAdj(3)); // No edges for vertex 3
}


// Test Method: testProxAdj
@Test
public void testProxAdj() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(1, 2, 10);
    grafo.insereAresta(1, 3, 20);
    Aresta aresta = grafo.primeiroListaAdj(1);
    assertEquals(2, aresta.v2());
    aresta = grafo.proxAdj(1);
    assertEquals(3, aresta.v2());
    aresta = grafo.proxAdj(1);
    assertNull(aresta); // No more adjacent edges
}


// Test Method: testRetiraAresta
@Test
public void testRetiraAresta() throws Exception {
    Grafo grafo = new Grafo();
    grafo.insereAresta(4, 5, 15);
    Aresta aresta = grafo.retiraAresta(4, 5);
    assertNotNull(aresta);
    assertEquals(4, aresta.v1());
    assertEquals(5, aresta.v2());
    assertEquals(15, aresta.peso());
    assertFalse(grafo.existeAresta(4, 5)); // Validate removal
}


// Test Method: testNumVertices
@Test
public void testNumVertices() {
    Grafo grafo = new Grafo();
    assertEquals(100, grafo.numVertices()); // Check default number of vertices
}


// Test Method: testGrafoTransposto
@Test
public void testGrafoTransposto() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(7, 8, 25);
    Grafo transposto = grafo.grafoTransposto();
    assertTrue(transposto.existeAresta(8, 7));
    assertFalse(transposto.existeAresta(7, 8));
}


// Test Method: testListaAdjVaziaException
@Test
public void testListaAdjVaziaException() {
    Grafo grafo = new Grafo();
    assertThrows(Exception.class, () -> { 
        grafo.retiraAresta(0, 1); // Should throw an exception since it's empty
    });
}


}