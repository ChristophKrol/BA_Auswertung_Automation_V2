package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrafoTest{

/*
// Test Method: testInsereAresta
@Test 
void testInsereAresta(){
 Grafo grafo = new Grafo();
 Aresta aresta = new Aresta(1, 2, 3);
 grafo.insereAresta(aresta);
 assertEquals(3, grafo.mat[1][2]);
}


 */
/*
// Test Method: testExisteAresta
@Test 
void testExisteAresta(){
 Grafo grafo = new Grafo();
 Aresta aresta = new Aresta(1, 2, 3);
 grafo.insereAresta(aresta);
 assertTrue(grafo.existeAresta(1, 2));
}

 */


// Test Method: testListaAdjVazia
@Test 
void testListaAdjVazia(){
 Grafo grafo = new Grafo();
 assertTrue(grafo.listaAdjVazia(1));
}

/*
// Test Method: testPrimeiroListaAdj
@Test 
void testPrimeiroListaAdj(){
 Grafo grafo = new Grafo();
 Aresta aresta = new Aresta(1, 2, 3);
 grafo.insereAresta(aresta);
 assertEquals(new Aresta(1, 2, 3), grafo.primeiroListaAdj(1));
}


 */
/*
// Test Method: testProxAdj
@Test 
void testProxAdj(){
 Grafo grafo = new Grafo();
 Aresta aresta = new Aresta(1, 2, 3);
 grafo.insereAresta(aresta);
 assertEquals(new Aresta(1, 2, 3), grafo.proxAdj(1));
}


// Test Method: testRetiraAresta
@Test 
void testRetiraAresta(){
 Grafo grafo = new Grafo();
 Aresta aresta = new Aresta(1, 2, 3);
 grafo.insereAresta(aresta);
 assertEquals(new Aresta(1, 2, 3), grafo.retiraAresta(1, 2));
}


// Test Method: testGrafoTransposto
@Test 
void testGrafoTransposto(){
 Grafo grafo = new Grafo();
 Aresta aresta = new Aresta(1, 2, 3);
 grafo.insereAresta(aresta);
 assertEquals(new Grafo(), grafo.grafoTransposto());
}

 */


}