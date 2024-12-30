import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscaEmProfundidadeTest{


// Test Method: testVisitaDfsWithValidVertex
@Test
public void testVisitaDfsWithValidVertex() throws Exception {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(1, 2, 1);
    BuscaEmProfundidade busca = new BuscaEmProfundidade(grafo);

    int[] cor = new int[3];
    Arrays.fill(cor, BuscaEmProfundidade.branco);
    busca.visitaDfs(0, 0, cor);

    assertEquals(BuscaEmProfundidade.preto, cor[0]);
    assertEquals(BuscaEmProfundidade.preto, cor[1]);
    assertEquals(BuscaEmProfundidade.preto, cor[2]);
}


// Test Method: testVisitaDfsWithIsolation
@Test
public void testVisitaDfsWithIsolation() throws Exception {
    Grafo grafo = new Grafo(1);
    BuscaEmProfundidade busca = new BuscaEmProfundidade(grafo);

    int[] cor = new int[1];
    Arrays.fill(cor, BuscaEmProfundidade.branco);
    int tempo = busca.visitaDfs(0, 0, cor);
    assertEquals(1, tempo);
    assertEquals(BuscaEmProfundidade.preto, cor[0]);
}


// Test Method: testBuscaEmProfundidadeOnDisconnectedGraph
@Test
public void testBuscaEmProfundidadeOnDisconnectedGraph() throws Exception {
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(2, 3, 1);
    BuscaEmProfundidade busca = new BuscaEmProfundidade(grafo);

    busca.buscaEmProfundidade();

    assertEquals(1, busca.d(0));
    assertEquals(2, busca.d(1));
    assertEquals(1, busca.d(2));
    assertEquals(2, busca.d(3));
}


// Test Method: testDForValidVertex
@Test
public void testDForValidVertex() throws Exception {
    Grafo grafo = new Grafo(2);
    grafo.insereAresta(0, 1, 1);
    BuscaEmProfundidade busca = new BuscaEmProfundidade(grafo);
    busca.buscaEmProfundidade();

    assertTrue(busca.d(1) > busca.d(0));
}


// Test Method: testDForInvalidVertex
@Test
public void testDForInvalidVertex() {
    Grafo grafo = new Grafo(2);
    BuscaEmProfundidade busca = new BuscaEmProfundidade(grafo);

    Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> { 
        busca.d(5);
    });
}


}