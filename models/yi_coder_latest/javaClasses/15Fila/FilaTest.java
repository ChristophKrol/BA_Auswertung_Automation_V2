import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilaTest{


// Test Method: testEnfileiraWithFullQueue
@Test 
void testEnfileiraWithFullQueue() throws Exception {
 Fila fila = new Fila();
 for (int i=0; i<999; i++) { fila.enfileira(new Object()); }
 assertThrows(Exception.class, () -> fila.enfileira(new Object()));
}


// Test Method: testDesenfileiraWithEmptyQueue
@Test 
void testDesenfileiraWithEmptyQueue() throws Exception {
 Fila fila = new Fila();
 assertThrows(Exception.class, () -> fila.desenfileira());
}


// Test Method: testEnfileiraDesenfileiraWithNormalOperation
@Test 
void testEnfileiraDesenfileiraWithNormalOperation() throws Exception {
 Fila fila = new Fila();
 Object obj1 = new Object(), obj2 = new Object();
 fila.enfileira(obj1);
 fila.enfileira(obj2);
 assertEquals(obj1, fila.desenfileira());
 assertEquals(obj2, fila.desenfileira());
}


}