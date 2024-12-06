package ds;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FilaTest{


// Test Method: testCriaUmaFilaVazia
@Test
void testCriaUmaFilaVazia() {
    Fila fila = new Fila();
    assertTrue(fila.vazia());
}


// Test Method: testEnfileira
@Test
void testEnfileira() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("a");
    assertFalse(fila.vazia());
}


// Test Method: testDesenfileira
@Test
void testDesenfileira() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("a");
    assertEquals("a", fila.desenfileira());
}


// Test Method: testDesenfileiraEmUmaFilaVazia
@Test
void testDesenfileiraEmUmaFilaVazia() {
    Fila fila = new Fila();
    try {
        fila.desenfileira();
        fail("Deveria lançar uma exceção");
    } catch (Exception e) {
        assertEquals("Erro: A fila esta vazia", e.getMessage());
    }

/*
// Test Method: testImprime
@Test
void testImprime() throws Exception {
    Fila fila = new Fila();
    fila.enfileira("a");
    fila.enfileira("b");
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    fila.imprime();
    assertEquals(" a b", outContent.toString());
}
*/

}}