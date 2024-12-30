import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrafoTest{


// Test Method: testInsereAresta_validInput
@Test
public void testInsereAresta_validInput() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    assertTrue(grafo.existeAresta(0, 1));
}


// Test Method: testInsereAresta_negativeWeight
@Test
public void testInsereAresta_negativeWeight() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, -5);
    assertFalse(grafo.existeAresta(0, 1));
}


// Test Method: testInsereAresta_zeroWeight
@Test
public void testInsereAresta_zeroWeight() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 0);
    assertFalse(grafo.existeAresta(0, 1));
}


// Test Method: testListaAdjVazia
@Test
public void testListaAdjVazia() {
    Grafo grafo = new Grafo();
    assertTrue(grafo.listaAdjVazia(0));
    grafo.insereAresta(0, 1, 10);
    assertFalse(grafo.listaAdjVazia(0));
}


// Test Method: testRetiraAresta_existingEdge
@Test
public void testRetiraAresta_existingEdge() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    Aresta aresta = grafo.retiraAresta(0, 1);
    assertNotNull(aresta);
    assertEquals(10, aresta.peso());
    assertFalse(grafo.existeAresta(0, 1));
}


// Test Method: testRetiraAresta_nonExistingEdge
@Test
public void testRetiraAresta_nonExistingEdge() {
    Grafo grafo = new Grafo();
    Aresta aresta = grafo.retiraAresta(0, 1);
    assertNull(aresta);
}


// Test Method: testPrimeiroListaAdj_emptyAdjacencyList
@Test
public void testPrimeiroListaAdj_emptyAdjacencyList() {
    Grafo grafo = new Grafo();
    Aresta aresta = grafo.primeiroListaAdj(0);
    assertNull(aresta);
}


// Test Method: testGrafoTransposto
@Test
public void testGrafoTransposto() {
    Grafo grafo = new Grafo();
    grafo.insereAresta(0, 1, 10);
    Grafo grafoT = grafo.grafoTransposto();
    assertTrue(grafoT.existeAresta(1, 0));
    assertFalse(grafoT.existeAresta(0, 1));
}


}