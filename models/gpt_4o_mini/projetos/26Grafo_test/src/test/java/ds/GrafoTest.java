package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrafoTest{


// Test Method: testGrafoInitializationPositiveBoundary
@Test
public void testGrafoInitializationPositiveBoundary() throws Exception {
    Grafo grafo = new Grafo(1);
    assertEquals(1, grafo.numVertices());
}


// Test Method: testGrafoInitializationNegativeBoundary
@Test
public void testGrafoInitializationNegativeBoundary() throws Exception {
    Grafo grafo = new Grafo(0);
    assertEquals(0, grafo.numVertices());
}


// Test Method: testInsereArestaNormal
@Test
public void testInsereArestaNormal() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    assertTrue(grafo.existeAresta(0, 1));
}

/*
// Test Method: testInsereArestaNoSpace
@Test
public void testInsereArestaNoSpace() throws Exception {
    Grafo grafo = new Grafo(1);
    grafo.insereAresta(0, 0, 100);
    // Test inserting another edge exceeding capacity
    grafo.insereAresta(0, 1, 100);
    // Check that the edge was not added
    assertFalse(grafo.existeAresta(0, 1));
}


 */

// Test Method: testListaAdjVaziaTrue
@Test
public void testListaAdjVaziaTrue() throws Exception {
    Grafo grafo = new Grafo(3);
    assertTrue(grafo.listaAdjVazia(0));
}


// Test Method: testListaAdjVaziaFalse
@Test
public void testListaAdjVaziaFalse() throws Exception {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 1);
    assertFalse(grafo.listaAdjVazia(0));
}


// Test Method: testRetiraArestaExistente
@Test
public void testRetiraArestaExistente() throws Exception {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 5);
    Grafo.Aresta aresta = grafo.retiraAresta(0, 1);
    assertNotNull(aresta);
    assertEquals(5, aresta.peso());
    assertFalse(grafo.existeAresta(0, 1));
}


// Test Method: testRetiraArestaInexistente
@Test
public void testRetiraArestaInexistente() throws Exception {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 5);
    Grafo.Aresta aresta = grafo.retiraAresta(0, 2);
    assertNull(aresta);
}


// Test Method: testGrafoTranspostoNoEdges
@Test
public void testGrafoTranspostoNoEdges() throws Exception {
    Grafo grafo = new Grafo(3);
    Grafo transposto = grafo.grafoTransposto();
    assertEquals(grafo.numVertices(), transposto.numVertices());
}


// Test Method: testGrafoTranspostoWithEdges
@Test
public void testGrafoTranspostoWithEdges() throws Exception {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 5);
    Grafo transposto = grafo.grafoTransposto();
    assertTrue(transposto.existeAresta(1, 0));
}


}