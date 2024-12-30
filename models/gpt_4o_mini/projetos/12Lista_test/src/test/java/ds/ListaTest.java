package ds;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest{


// Test Method: testInsere
@Test
public void testInsere() {
    Lista lista = new Lista();
    lista.insere("item1");
    lista.insere("item2");
    // Check if items are inserted correctly
    assertFalse(lista.vazia());
    // Capture printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    lista.imprime();
    assertTrue(outputStream.toString().contains("item1"));
    assertTrue(outputStream.toString().contains("item2"));
}


// Test Method: testVaziaWhenEmpty
@Test
public void testVaziaWhenEmpty() {
    Lista lista = new Lista();
    assertTrue(lista.vazia());
}


// Test Method: testVaziaWhenNotEmpty
@Test
public void testVaziaWhenNotEmpty() {
    Lista lista = new Lista();
    lista.insere("item1");
    assertFalse(lista.vazia());
}


// Test Method: testPrintOutput
@Test
public void testPrintOutput() {
    Lista lista = new Lista();
    lista.insere("item1");
    lista.insere("item2");
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    lista.imprime();
    String output = outputStream.toString();
    assertTrue(output.contains("item1"));
    assertTrue(output.contains("item2"));
}

/*
// Test Method: testBoundaryConditions
@Test
public void testBoundaryConditions() {
    Lista lista = new Lista();
    lista.insere(null);
    assertFalse(lista.vazia());
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    lista.imprime();
    assertTrue(outputStream.toString().contains("null"));
}


 */

}