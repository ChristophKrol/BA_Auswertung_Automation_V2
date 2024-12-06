package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrafoTest{


// Test Method: testInsercaoAresta
@Test 
void testInsercaoAresta() { 
  Grafo g = new Grafo(); 
  g.insereAresta(1, 2, 3); 
  assertTrue(g.existeAresta(1, 2)); 
}


// Test Method: testListaAdjVazia
@Test 
void testListaAdjVazia() { 
  Grafo g = new Grafo(); 
  assertTrue(g.listaAdjVazia(1)); 
}
/*

// Test Method: testPrimeiroProxAdj
@Test 
void testPrimeiroProxAdj() { 
  Grafo g = new Grafo(); 
  g.insereAresta(1, 2, 3); 
  Aresta a = g.primeiroListaAdj(1); 
  assertEquals(new Aresta(1, 2, 3), a); 
}


 */
/*
// Test Method: testRetiraAresta
@Test 
void testRetiraAresta() { 
  Grafo g = new Grafo(); 
  g.insereAresta(1, 2, 3); 
  assertEquals(new Aresta(1, 2, 3), g.retiraAresta(1, 2)); 
}


 */

}