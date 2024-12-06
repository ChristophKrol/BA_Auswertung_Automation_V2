package ds;

import ds.Grafo;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class GrafoTest{

/*
// Test Method: testGrafoConstructor
@Test 
void testGrafoConstructor() {
	Grafo grafo = new Grafo();
	assertThat(grafo.numVertices, equalTo(100));
	assertThat(grafo.mat.length, equalTo(100));
	assertThat(grafo.pos.length, equalTo(100));
}



// Test Method: testInsereAresta
@Test 
void testInsereAresta() {
	Grafo grafo = new Grafo();
	grafo.insereAresta(0, 1, 5);
	assertThat(grafo.mat[0][1], equalTo(5));
}
*/


// Test Method: testExisteAresta
@Test 
void testExisteAresta() {
	Grafo grafo = new Grafo();
	grafo.insereAresta(0, 1, 5);
	assertTrue(grafo.existeAresta(0, 1));
}


/*
// Test Method: testListaAdjVazia
@Test 
void testListaAdjVazia() {
	Grafo grafo = new Grafo();
	assertFalse(grafo.listaAdjVazia(0));
}



 */
/*
// Test Method: testPrimeiroListaAdj
@Test 
void testPrimeiroListaAdj() {
	Grafo grafo = new Grafo();
	Aresta aresta = grafo.primeiroListaAdj(0);
	assertThat(aresta, notNullValue());
}



// Test Method: testRetiraAresta
@Test 
void testRetiraAresta() {
	Grafo grafo = new Grafo();
	grafo.insereAresta(0, 1, 5);
	Aresta aresta = grafo.retiraAresta(0, 1);
	assertThat(aresta, notNullValue());
}


 */


// Test Method: testGrafoTransposto
@Test 
void testGrafoTransposto() {
	Grafo grafo = new Grafo();
	grafo.insereAresta(0, 1, 5);
	Grafo grafoT = grafo.grafoTransposto();
	assertTrue(grafoT.existeAresta(1, 0));
}



}