import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilaTest{


// Test Method: testFilaInitialization
@Test
public void testFilaInitialization() {
    Fila fila = new Fila();
    assertTrue(fila.vazia());
}


// Test Method: testEnfileiraAndVazia
@Test
public void testEnfileiraAndVazia() {
    Fila fila = new Fila();
    fila.enfileira("item1");
    assertFalse(fila.vazia());
    fila.enfileira("item2");
    assertFalse(fila.vazia());
}


// Test Method: testDesenfileiraSingleItem
@Test
public void testDesenfileiraSingleItem() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("item1");
    Object item = fila.desenfileira();
    assertEquals("item1", item);
    assertTrue(fila.vazia());
}


// Test Method: testDesenfileiraMultipleItems
@Test
public void testDesenfileiraMultipleItems() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("item1");
    fila.enfileira("item2");
    Object firstItem = fila.desenfileira();
    assertEquals("item1", firstItem);
    Object secondItem = fila.desenfileira();
    assertEquals("item2", secondItem);
    assertTrue(fila.vazia());
}


// Test Method: testDesenfileiraEmptyFilaThrowsException
@Test(expected = Exception.class)
public void testDesenfileiraEmptyFilaThrowsException() throws Exception {
    Fila fila = new Fila();
    fila.desenfileira();
}


// Test Method: testImprimeWithItems
@Test
public void testImprimeWithItems() {
    Fila fila = new Fila();
    fila.enfileira("item1");
    fila.enfileira("item2");
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    fila.imprime();
    String output = outputStream.toString().trim();
    assertEquals(" item1 item2", output);
}


// Test Method: testEnfileiraBoundaryValues
@Test
public void testEnfileiraBoundaryValues() {
    Fila fila = new Fila();
    fila.enfileira("boundary1");
    fila.enfileira("boundary2");
    assertFalse(fila.vazia());
    assertEquals("boundary1", fila.desenfileira());
    assertEquals("boundary2", fila.desenfileira());
    assertTrue(fila.vazia());
}


}