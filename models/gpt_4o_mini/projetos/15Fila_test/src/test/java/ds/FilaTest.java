package ds;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FilaTest{

/*
// Test Method: testEnfileira_ShouldThrowException_WhenQueueIsFull
@Test
public void testEnfileira_ShouldThrowException_WhenQueueIsFull() throws Exception {
    Fila fila = new Fila();
    // Fill the queue to its capacity
    for (int i = 0; i < 1000; i++) {
        fila.enfileira(new Object());
    }
    // Attempt to add another element which should throw an exception
    Exception exception = assertThrows(Exception.class, () -> {
        fila.enfileira(new Object());
    });
    assertEquals("Erro: A fila esta cheia", exception.getMessage());
}


 */

// Test Method: testDesenfileira_ShouldReturnFirstElement_WhenQueueIsNotEmpty
@Test
public void testDesenfileira_ShouldReturnFirstElement_WhenQueueIsNotEmpty() throws Exception {
    Fila fila = new Fila();
    Object firstElement = new Object();
    fila.enfileira(firstElement);
    Object result = fila.desenfileira();
    assertSame(firstElement, result);
}


// Test Method: testDesenfileira_ShouldThrowException_WhenQueueIsEmpty
@Test
public void testDesenfileira_ShouldThrowException_WhenQueueIsEmpty() throws Exception {
    Fila fila = new Fila();
    Exception exception = assertThrows(Exception.class, () -> {
        fila.desenfileira();
    });
    assertEquals("Erro: A fila esta vazia", exception.getMessage());
}


// Test Method: testVazia_ShouldReturnTrue_WhenQueueIsEmpty
@Test
public void testVazia_ShouldReturnTrue_WhenQueueIsEmpty() {
    Fila fila = new Fila();
    assertTrue(fila.vazia());
}


// Test Method: testVazia_ShouldReturnFalse_WhenQueueHasElements
@Test
public void testVazia_ShouldReturnFalse_WhenQueueHasElements() throws Exception {
    Fila fila = new Fila();
    fila.enfileira(new Object());
    assertFalse(fila.vazia());
}

/*
// Test Method: testImprime_ShouldPrintElements_WhenQueueIsNotEmpty
@Test
public void testImprime_ShouldPrintElements_WhenQueueIsNotEmpty() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("First");
    fila.enfileira("Second");
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    fila.imprime();
    String expectedOutput = "First\nSecond\n";
    assertEquals(expectedOutput, outContent.toString());
    System.setOut(System.out); // Reset the standard output
}
*/

}