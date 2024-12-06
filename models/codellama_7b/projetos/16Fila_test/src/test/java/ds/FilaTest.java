package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilaTest{


// Test Method: testVazia
@Test 
void testVazia(){
 Fila fila = new Fila ();
 assertTrue(fila.vazia());
}


// Test Method: testEnfileira
@Test 
void testEnfileira(){
 Fila fila = new Fila ();
 Object item = new Object();
 fila.enfileira(item);
 assertFalse(fila.vazia());
}


// Test Method: testDesenfileira
@Test 
void testDesenfileira() throws Exception {
 Fila fila = new Fila ();
 Object item = new Object();
 fila.enfileira(item);
 assertEquals(item, fila.desenfileira());
}

/*
// Test Method: testImprime
@Test 
void testImprime(){
 Fila fila = new Fila ();
 Object item1 = new Object();
 Object item2 = new Object();
 fila.enfileira(item1);
 fila.enfileira(item2);
 assertEquals(" " + item1.toString () + " " + item2.toString (), fila.imprime());
}
*/
/*
// Test Method: testEnfileiraVazia
@Test 
void testEnfileiraVazia(){
 Fila fila = new Fila ();
 Object item = new Object();
 assertThrows(Exception.class, () -> {fila.enfileira(item);});
}


 */
// Test Method: testDesenfileiraVazia
@Test 
void testDesenfileiraVazia(){
 Fila fila = new Fila ();
 assertThrows(Exception.class, () -> {fila.desenfileira();});
}


}