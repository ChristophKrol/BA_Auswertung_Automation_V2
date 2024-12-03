import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest{


// Test Method: testCriaListaVazia
@Test
void testCriaListaVazia() {
    Lista lista = new Lista();
    assertTrue(lista.vazia());
}


// Test Method: testInsereElemento
@Test
void testInsereElemento() {
    Lista lista = new Lista();
    lista.insere(10);
    assertFalse(lista.vazia());
}


// Test Method: testImprimeLista
@Test
void testImprimeLista() {
    Lista lista = new Lista();
    lista.insere(10);
    lista.insere(20);
    String output = "10
20";
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    System.setOut(ps);
    lista.imprime();
    assertEquals(output, baos.toString());
}


}