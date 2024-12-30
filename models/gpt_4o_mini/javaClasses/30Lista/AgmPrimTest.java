import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgmPrimTest{


// Test Method: testObterAgm_ValidRoot
@Test
public void testObterAgm_ValidRoot() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    grafo.insereAresta(0, 2, 6);
    grafo.insereAresta(0, 3, 5);
    grafo.insereAresta(1, 3, 15);
    grafo.insereAresta(2, 3, 4);

    AgmPrim agm = new AgmPrim(grafo);
    agm.obterAgm(0);

    assertEquals(0, agm.antecessor(1));
    assertEquals(0, agm.antecessor(2));
    assertEquals(2, agm.antecessor(3));
}


// Test Method: testObterAgm_InvalidRoot
@Test
public void testObterAgm_InvalidRoot() {
    Grafo grafo = new Grafo(5);
    AgmPrim agm = new AgmPrim(grafo);
    Exception exception = assertThrows(Exception.class, () -> { agm.obterAgm(-1); });
    assertEquals("Invalid root", exception.getMessage());
}


// Test Method: testAntecessor_ValidIndex
@Test
public void testAntecessor_ValidIndex() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    AgmPrim agm = new AgmPrim(grafo);
    agm.obterAgm(0);

    assertEquals(-1, agm.antecessor(0));
    assertNotEquals(-1, agm.antecessor(1));
}


// Test Method: testPeso_ValidIndex
@Test
public void testPeso_ValidIndex() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    AgmPrim agm = new AgmPrim(grafo);
    agm.obterAgm(0);
    assertEquals(0.0, agm.peso(0));
    assertNotEquals(Double.MAX_VALUE, agm.peso(1));
}


// Test Method: testImprime
@Test
public void testImprime() throws Exception {
    Grafo grafo = new Grafo(5);
    grafo.insereAresta(0, 1, 10);
    agm = new AgmPrim(grafo);
    agm.obterAgm(0);
    // Capture output and verify
    agm.imprime();
    // Verify console output or use a PrintStream to capture output
}


// Test Method: testDiminuiChave_NegativeNewValue
@Test
public void testDiminuiChave_NegativeNewValue() throws Exception {
    FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{Double.MAX_VALUE, 0}, new int[]{0, 1});
    Exception exception = assertThrows(Exception.class, () -> { heap.diminuiChave(1, -1); });
    assertEquals("Erro: chaveNova com valor incorreto", exception.getMessage());
}


// Test Method: testRetiraMin_EmptyHeap
@Test
public void testRetiraMin_EmptyHeap() throws Exception {
    FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{}, new int[]{0});
    Exception exception = assertThrows(Exception.class, () -> { heap.retiraMin(); });
    assertEquals("Erro: heap vazio", exception.getMessage());
}


// Test Method: testRetiraAresta_InvalidEdge
@Test
public void testRetiraAresta_InvalidEdge() throws Exception {
    Grafo grafo = new Grafo(5);
    Exception exception = assertThrows(Exception.class, () -> { grafo.retiraAresta(0, 1); });
    assertEquals("Erro: Lista vazia ou chave invalida", exception.getMessage());
}


}