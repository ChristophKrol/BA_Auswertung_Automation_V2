package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest{


// Test Method: testInsere_ValidElement_ShouldInsertElementSuccessfully
@Test
public void testInsere_ValidElement_ShouldInsertElementSuccessfully() throws Exception {
    Lista lista = new Lista();
    Object element = new Object();
    lista.insere(element);
    assertFalse(lista.vazia());
    assertEquals(element, lista.item[0]);
}


// Test Method: testInsere_ExceptionWhenListIsFull
@Test
public void testInsere_ExceptionWhenListIsFull() {
    Lista lista = new Lista();
    try {
        for (int i = 0; i < 1001; i++) {
            lista.insere(new Object());
        }
        fail("Expected Exception not thrown");
    } catch (Exception e) {
        assertEquals("Erro: A lista esta cheia", e.getMessage());
    }
}


// Test Method: testVazia_WhenListIsEmpty_ShouldReturnTrue
@Test
public void testVazia_WhenListIsEmpty_ShouldReturnTrue() {
    Lista lista = new Lista();
    assertTrue(lista.vazia());
}


// Test Method: testVazia_WhenListIsNotEmpty_ShouldReturnFalse
@Test
public void testVazia_WhenListIsNotEmpty_ShouldReturnFalse() throws Exception {
    Lista lista = new Lista();
    lista.insere(new Object());
    assertFalse(lista.vazia());
}


// Test Method: testImprime_ShouldPrintElementsWithoutError
@Test
public void testImprime_ShouldPrintElementsWithoutError() throws Exception {
    Lista lista = new Lista();
    lista.insere("Element 1");
    lista.insere("Element 2");
    lista.insere("Element 3");
    // Here we can redirect stdout or use another mechanism to verify the output in tests.
    lista.imprime();
}


// Test Method: testInsere_BoundaryValue_ExactLimitShouldInsertSuccessfully
@Test
public void testInsere_BoundaryValue_ExactLimitShouldInsertSuccessfully() throws Exception {
    Lista lista = new Lista();
    for (int i = 0; i < 1000; i++) {
        lista.insere(new Object());
    }
    assertFalse(lista.vazia());
    assertEquals(1000, lista.ultimo);
}


// Test Method: testImprime_EmptyList_ShouldNotThrowException
@Test
public void testImprime_EmptyList_ShouldNotThrowException() {
    Lista lista = new Lista();
    lista.imprime(); // Ensure this does not throw an exception
}


}