import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilaTest{


// Test Method: testEnfileiraWithEmptyQueue
@Test
void testEnfileiraWithEmptyQueue() {
 assertEquals(1, Fila.enfileira(new Object()));
}


// Test Method: testEnfileiraWithFullQueue
@Test
void testEnfileiraWithFullQueue() {
 assertThrows(Exception.class, () -> Fila.enfileira(new Object()));
}


// Test Method: testDesenfileiraWithEmptyQueue
@Test
void testDesenfileiraWithEmptyQueue() {
 assertThrows(Exception.class, () -> Fila.desenfileira());
}


// Test Method: testDesenfileiraWithNonEmptyQueue
@Test
void testDesenfileiraWithNonEmptyQueue() {
 assertEquals(new Object(), Fila.desenfileira());
}


// Test Method: testVaziaWithEmptyQueue
@Test
void testVaziaWithEmptyQueue() {
 assertTrue(Fila.vazia());
}


// Test Method: testVaziaWithNonEmptyQueue
@Test
void testVaziaWithNonEmptyQueue() {
 assertFalse(Fila.vazia());
}


}