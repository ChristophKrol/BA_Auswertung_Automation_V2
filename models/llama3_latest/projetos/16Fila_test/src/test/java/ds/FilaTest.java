package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilaTest{

/*
// Test Method: testEmptyQueue
@Test 
void testEmptyQueue() throws Exception {
    Fila fila = new Fila();
    assertNull(fila.desenfileira());
}


 */


// Test Method: testEnqueueAndDequeue
@Test 
void testEnqueueAndDequeue() throws Exception {
    Fila fila = new Fila();
    Object item1 = "item1";
    Object item2 = "item2";
    fila.enfileira(item1);
    assertEquals(item1, fila.desenfileira());
    fila.enfileira(item2);
    assertEquals(item2, fila.desenfileira());
}


/*
// Test Method: testEnqueueMultipleItems
@Test 
void testEnqueueMultipleItems() throws Exception {
    Fila fila = new Fila();
    Object item1 = "item1";
    Object item2 = "item2";
    Object item3 = "item3";
    fila.enfileira(item1);
    fila.enfileira(item2);
    fila.enfileira(item3);
    assertEquals(item3, fila.desenfileira());
    assertEquals(item2, fila.desenfileira());
    assertEquals(item1, fila.desenfileira());
}


 */


// Test Method: testDequeueFromEmptyQueue
@Test 
void testDequeueFromEmptyQueue() throws Exception {
    Fila fila = new Fila();
    try {
        fila.desenfileira();
        fail("Expected exception");
    } catch (Exception e) {
        assertEquals("Erro: A fila esta vazia", e.getMessage());
    }
}


/*
// Test Method: testImprimeQueue
@Test 
void testImprimeQueue() throws Exception {
    Fila fila = new Fila();
    Object item1 = "item1";
    Object item2 = "item2";
    Object item3 = "item3";
    fila.enfileira(item1);
    fila.enfileira(item2);
    fila.enfileira(item3);
    fila.imprime();
    assertEquals(" item3 item2 item1", fila.desenfileira());
}


 */


}