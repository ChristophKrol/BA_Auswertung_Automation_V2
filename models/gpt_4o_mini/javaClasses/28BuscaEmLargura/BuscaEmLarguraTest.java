import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscaEmLarguraTest{


// Test Method: testVisitaBfsValidVertex
@Test
void testVisitaBfsValidVertex() throws Exception {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(1, 2, 1);
    BuscaEmLargura bfs = new BuscaEmLargura(grafo);
    bfs.buscaEmLargura();
    assertEquals(1, bfs.d(1));
    assertEquals(2, bfs.d(2));
    assertEquals(0, bfs.d(0));
}


// Test Method: testVisitaBfsDisconnectedGraph
@Test
void testVisitaBfsDisconnectedGraph() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(1, 0, 1);
    BuscaEmLargura bfs = new BuscaEmLargura(grafo);
    bfs.buscaEmLargura();
    assertEquals(0, bfs.d(0)); // starting node
    assertEquals(1, bfs.d(1));
    assertEquals(Integer.MAX_VALUE, bfs.d(2)); // disconnected
}


// Test Method: testPrintPathExists
@Test
void testPrintPathExists() {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(1, 2, 1);
    BuscaEmLargura bfs = new BuscaEmLargura(grafo);
    bfs.buscaEmLargura();
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    bfs.imprimeCaminho(0, 2);
    String expectedOutput = "0\n1\n2\n"; // output from visiting
    assertTrue(outContent.toString().contains(expectedOutput));
}


// Test Method: testPrintPathNotExists
@Test
void testPrintPathNotExists() {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 1);
    BuscaEmLargura bfs = new BuscaEmLargura(grafo);
    bfs.buscaEmLargura();
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    bfs.imprimeCaminho(0, 2);
    assertTrue(outContent.toString().contains("Nao existe caminho de 0 ate 2"));
}


// Test Method: testDArrayInitialization
@Test
void testDArrayInitialization() throws Exception {
    Grafo grafo = new Grafo(3);
    BuscaEmLargura bfs = new BuscaEmLargura(grafo);
    bfs.buscaEmLargura();
    assertEquals(Integer.MAX_VALUE, bfs.d(0));
    assertEquals(Integer.MAX_VALUE, bfs.d(1));
    assertEquals(Integer.MAX_VALUE, bfs.d(2));
}


// Test Method: testNegativeVertexIndex
@Test
void testNegativeVertexIndex() {
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 1);
    BuscaEmLargura bfs = new BuscaEmLargura(grafo);
    Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        bfs.d(-1);
    });
    assertEquals("Index -1 out of bounds for length 3", exception.getMessage());
}


}