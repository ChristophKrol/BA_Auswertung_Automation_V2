package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscaEmProfundidadeTest{

/*
// Test Method: testVisitaDfsWithWhiteVertex
@Test
public void testVisitaDfsWithWhiteVertex() throws Exception {
    // Arrange
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(1, 2, 1);
    BuscaEmProfundidade busca = new BuscaEmProfundidade(grafo);
    int[] cor = new int[3];
    int tempo = 0;

    // Act
    tempo = busca.visitaDfs(0, tempo, cor);

    // Assert
    assertEquals(1, busca.d(0));
    assertEquals(2, busca.t(0));
    assertEquals(BuscaEmProfundidade.cinza, cor[0]);
    assertEquals(BuscaEmProfundidade.preto, cor[0]);
}


 */
/*
// Test Method: testVisitaDfsWithAdjacentVertices
@Test
public void testVisitaDfsWithAdjacentVertices() throws Exception {
    // Arrange
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(1, 2, 1);
    busca = new BuscaEmProfundidade(grafo);
    int[] cor = new int[3];
    int tempo = 0;

    // Act
    busca.visitaDfs(1, tempo, cor);

    // Assert
    assertEquals(1, busca.d(1));
    assertEquals(BuscaEmProfundidade.cinza, cor[1]);
    assertEquals(BuscaEmProfundidade.preto, cor[0]);
}


 */
/*
// Test Method: testBuscaEmProfundidadeWithNoEdges
@Test
public void testBuscaEmProfundidadeWithNoEdges() throws Exception {
    // Arrange
    Grafo grafo = new Grafo(3);
    BuscaEmProfundidade busca = new BuscaEmProfundidade(grafo);

    // Act
    busca.buscaEmProfundidade();

    // Assert
    assertEquals(0, busca.d(0));
    assertEquals(0, busca.t(0));
    assertEquals(-1, busca.antecessor(0));
}
*/

/*

// Test Method: testBuscaEmProfundidadeWithMultipleEdges
@Test
public void testBuscaEmProfundidadeWithMultipleEdges() throws Exception {
    // Arrange
    Grafo grafo = new Grafo(4);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(0, 2, 1);
    grafo.insereAresta(1, 3, 1);
    busca = new BuscaEmProfundidade(grafo);

    // Act
    busca.buscaEmProfundidade();

    // Assert
    assertEquals(0, busca.d(0));
    assertEquals(0, busca.t(0));
    assertEquals(-1, busca.antecessor(0));
    assertEquals(1, busca.d(1));
    assertEquals(2, busca.t(1));
}


 */
/*
// Test Method: testBuscaEmProfundidadeWithCycle
@Test
public void testBuscaEmProfundidadeWithCycle() throws Exception {
    // Arrange
    Grafo grafo = new Grafo(3);
    grafo.insereAresta(0, 1, 1);
    grafo.insereAresta(1, 2, 1);
    grafo.insereAresta(2, 0, 1);
    busca = new BuscaEmProfundidade(grafo);

    // Act
    busca.buscaEmProfundidade();

    // Assert
    assertEquals(0, busca.d(0));
    assertEquals(3, busca.t(0));
    assertEquals(-1, busca.antecessor(0));
}


 */
/*
// Test Method: testSeekVertexForNegativeIndex
@Test
public void testSeekVertexForNegativeIndex() {
    // Arrange
    grafo = new Grafo(3);
    busca = new BuscaEmProfundidade(grafo);

    // Act & Assert
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        busca.d(-1);
    });
}


 */
/*
// Test Method: testSeekVertexForExceedingIndex
@Test
public void testSeekVertexForExceedingIndex() {
    // Arrange
    grafo = new Grafo(3);
    busca = new BuscaEmProfundidade(grafo);

    // Act & Assert
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        busca.t(3);
    });
}


 */

}