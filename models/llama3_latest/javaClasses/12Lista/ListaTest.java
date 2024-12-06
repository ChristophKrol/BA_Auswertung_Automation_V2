import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest{


// Test Method: testEmptyList
@Test
void testEmptyList() {
    Lista lista = new Lista();
    assertTrue(lista.vazia());
}



// Test Method: testInsertOneElement
@Test
void testInsertOneElement() {
    Lista lista = new Lista();
    lista.insere("Item 1");
    assertFalse(lista.vazia());
}



// Test Method: testInsertMultipleElements
@Test
void testInsertMultipleElements() {
    Lista lista = new Lista();
    lista.insere("Item 1");
    lista.insere("Item 2");
    lista.insere("Item 3");
    assertFalse(lista.vazia());
}



// Test Method: testPrintList
@Test
void testPrintList() {
    Lista lista = new Lista();
    lista.insere("Item 1");
    lista.insere("Item 2");
    lista.insere("Item 3");
    lista.imprime();
}



// Test Method: testInsertNullElement
@Test
void testInsertNullElement() {
    Lista lista = new Lista();
    lista.insere(null);
    assertFalse(lista.vazia());
}



}