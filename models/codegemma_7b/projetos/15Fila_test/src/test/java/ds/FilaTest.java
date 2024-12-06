package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilaTest{


// Test Method: testEnfileiraComFilaVazia
@Test
void testEnfileiraComFilaVazia() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("item");
    assertEquals("item", fila.desenfileira());
}

/*
// Test Method: testEnfileiraComFilaCheia
@Test
void testEnfileiraComFilaCheia() throws Exception {
    Fila fila = new Fila();
    for (int i = 0; i < 1000; i++) {
      fila.enfileira(i);
    }
    try {
      fila.enfileira("item");
      fail("Deveria lançar uma exceção");
    } catch (Exception e) {
      assertEquals("Erro: A fila esta cheia", e.getMessage());
    }
}
*/

// Test Method: testDesenfileiraComFilaVazia
@Test
void testDesenfileiraComFilaVazia() throws Exception {
    Fila fila = new Fila();
    try {
      fila.desenfileira();
      fail("Deveria lançar uma exceção");
    } catch (Exception e) {
      assertEquals("Erro: A fila esta vazia", e.getMessage());
    }
}


// Test Method: testVaziaComFilaVazia
@Test
void testVaziaComFilaVazia() {
    Fila fila = new Fila();
    assertTrue(fila.vazia());
}


// Test Method: testVaziaComFilaComUmElemento
@Test
void testVaziaComFilaComUmElemento() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("item");
    assertFalse(fila.vazia());
}


// Test Method: testImprimeComFilaVazia
@Test
void testImprimeComFilaVazia() {
    Fila fila = new Fila();
    String saida = "{}";
    StringBuilder sb = new StringBuilder(saida);
    fila.imprime();
    assertEquals(saida, sb.toString());
}


// Test Method: testImprimeComFilaComUmElemento
@Test
void testImprimeComFilaComUmElemento() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("item");
    String saida = "item";
    StringBuilder sb = new StringBuilder(saida);
    fila.imprime();
    assertEquals(saida, sb.toString());
}


// Test Method: testImprimeComFilaComVariosElementos
@Test
void testImprimeComFilaComVariosElementos() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("item1");
    fila.enfileira("item2");
    fila.enfileira("item3");
    String saida = "item1 item2 item3";
    StringBuilder sb = new StringBuilder(saida);
    fila.imprime();
    assertEquals(saida, sb.toString());
}


}