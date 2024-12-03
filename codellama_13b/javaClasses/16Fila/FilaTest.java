import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilaTest{


// Test Method: testEnfileiraWithNullItem
@Test
void testEnfileiraWithNullItem() {
  Fila fila = new Fila();
  assertThrows(Exception.class, () -> fila.enfileira(null));
}


// Test Method: testDesenfileiraFromEmptyQueue
@Test
void testDesenfileiraFromEmptyQueue() {
  Fila fila = new Fila();
  assertThrows(Exception.class, () -> fila.desenfileira());
}


// Test Method: testEnqueueAndDequeue
@Test
void testEnqueueAndDequeue() {
  Fila fila = new Fila();
  fila.enfileira(1);
  assertEquals(1, fila.desenfileira());
}


// Test Method: testVazia
@Test
void testVazia() {
  Fila fila = new Fila();
  assertTrue(fila.vazia());
}


}