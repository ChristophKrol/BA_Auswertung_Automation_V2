import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilaTest{


// Test Method: testEnfileiraWithEmptyArray
@Test 
void testEnfileiraWithEmptyArray() throws Exception {
 Fila fila = new Fila();
 assertThrows(Exception.class, () -> fila.enfileira(null));
}


// Test Method: testDesenfileiraWithEmptyArray
@Test 
void testDesenfileiraWithEmptyArray() throws Exception {
 Fila fila = new Fila();
 assertThrows(Exception.class, () -> fila.desenfileira());
}


// Test Method: testVaziaWithEmptyArray
@Test 
void testVaziaWithEmptyArray() throws Exception {
 Fila fila = new Fila();
 assertTrue(fila.vazia());
}


// Test Method: testEnfileiraWithOneElement
@Test 
void testEnfileiraWithOneElement() throws Exception {
 Fila fila = new Fila();
 Object item = new Object();
 fila.enfileira(item);
 assertFalse(fila.vazia());
}


// Test Method: testDesenfileiraWithOneElement
@Test 
void testDesenfileiraWithOneElement() throws Exception {
 Fila fila = new Fila();
 Object item = new Object();
 fila.enfileira(item);
 assertEquals(item, fila.desenfileira());
}


// Test Method: testVaziaWithOneElement
@Test 
void testVaziaWithOneElement() throws Exception {
 Fila fila = new Fila();
 Object item = new Object();
 fila.enfileira(item);
 assertFalse(fila.vazia());
}


// Test Method: testEnfileiraWithMultipleElements
@Test 
void testEnfileiraWithMultipleElements() throws Exception {
 Fila fila = new Fila();
 Object item1 = new Object();
 Object item2 = new Object();
 Object item3 = new Object();
 fila.enfileira(item1);
 fila.enfileira(item2);
 fila.enfileira(item3);
 assertFalse(fila.vazia());
}


// Test Method: testDesenfileiraWithMultipleElements
@Test 
void testDesenfileiraWithMultipleElements() throws Exception {
 Fila fila = new Fila();
 Object item1 = new Object();
 Object item2 = new Object();
 Object item3 = new Object();
 fila.enfileira(item1);
 fila.enfileira(item2);
 fila.enfileira(item3);
 assertEquals(item1, fila.desenfileira());
 assertEquals(item2, fila.desenfileira());
 assertEquals(item3, fila.desenfileira());
}


// Test Method: testVaziaWithMultipleElements
@Test 
void testVaziaWithMultipleElements() throws Exception {
 Fila fila = new Fila();
 Object item1 = new Object();
 Object item2 = new Object();
 Object item3 = new Object();
 fila.enfileira(item1);
 fila.enfileira(item2);
 fila.enfileira(item3);
 assertFalse(fila.vazia());
}


}