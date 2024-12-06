package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilaTest{

/*
// Test Method: testEnfileiraWithOneElement
@Test 
void testEnfileiraWithOneElement() throws Exception {
 Fila fila = new Fila();
 fila.enfileira(item);
 assertFalse(fila.vazia());
}


// Test Method: testDesenfileiraWithOneElement
@Test 
void testDesenfileiraWithOneElement() throws Exception {
 Fila fila = new Fila();
 fila.enfileira(item);
 Object result = fila.desenfileira();
 assertEquals(item, result);
 assertTrue(fila.vazia());
}
*/

// Test Method: testDesenfileiraWithEmptyQueue
@Test 
void testDesenfileiraWithEmptyQueue() throws Exception {
 Fila fila = new Fila();
 assertThrows(Exception.class, () -> fila.desenfileira());
}


}