import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilaTest{


// Test Method: testFilaEmptyArray
@Test
void testFilaEmptyArray(){
    Fila fila = new Fila();
    assertNull(fila.item);
}



// Test Method: testEnfileiraWithOneElement
@Test
void testEnfileiraWithOneElement() throws Exception {
    Fila fila = new Fila();
    Object item = new Object();
    fila.enfileira(item);
    assertEquals(fila.tras, 1);
}



// Test Method: testDesenfileiraWithEmptyFila
@Test
void testDesenfileiraWithEmptyFila() throws Exception {
    Fila fila = new Fila();
    assertNull(fila.desenfileira());
}



// Test Method: testEnfileiraWithFullFila
@Test
void testEnfileiraWithFullFila() throws Exception {
    Fila fila = new Fila();
    for (int i = 0; i < 1000; i++){
        Object item = new Object();
        fila.enfileira(item);
    }
    assertEquals(fila.tras, 1);
}



// Test Method: testDesenfileiraWithOneElement
@Test
void testDesenfileiraWithOneElement() throws Exception {
    Fila fila = new Fila();
    Object item = new Object();
    fila.enfileira(item);
    assertEquals(fila.desenfileira(), item);
}



// Test Method: testVazia
@Test
void testVazia() {
    Fila fila = new Fila();
    assertTrue(fila.vazia());
}



// Test Method: testImprime
@Test
void testImprime() {
    Fila fila = new Fila();
    Object item = new Object();
    fila.enfileira(item);
    fila.imprime();
}



}