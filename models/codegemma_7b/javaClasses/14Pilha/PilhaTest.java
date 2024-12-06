import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest{


// Test Method: testEmpilhaDesempilhaComPilhaVazia
@Test
void testEmpilhaDesempilhaComPilhaVazia() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("item");
    assertEquals("item", pilha.desempilha());
    assertTrue(pilha.vazia());
}


// Test Method: testEmpilhaDesempilhaComPilhaComUmElemento
@Test
void testEmpilhaDesempilhaComPilhaComUmElemento() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("item1");
    assertEquals("item1", pilha.desempilha());
    assertTrue(pilha.vazia());
}


// Test Method: testEmpilhaDesempilhaComPilhaComVariosElementos
@Test
void testEmpilhaDesempilhaComPilhaComVariosElementos() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("item1");
    pilha.empilha("item2");
    assertEquals("item2", pilha.desempilha());
    assertEquals("item1", pilha.desempilha());
    assertTrue(pilha.vazia());
}


// Test Method: testEmpilhaComPilhaCheia
@Test
void testEmpilhaComPilhaCheia() throws Exception {
    Pilha pilha = new Pilha();
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
      pilha.empilha(i);
    }
    try {
      pilha.empilha(Integer.MAX_VALUE);
      fail("Deveria lançar uma exceção");
    } catch (Exception e) {
      // Ignorar
    }
}


// Test Method: testDesempilhaComPilhaVazia
@Test
void testDesempilhaComPilhaVazia() throws Exception {
    Pilha pilha = new Pilha();
    try {
      pilha.desempilha();
      fail("Deveria lançar uma exceção");
    } catch (Exception e) {
      // Ignorar
    }
}


// Test Method: testTamanhoComPilhaVazia
@Test
void testTamanhoComPilhaVazia() {
    Pilha pilha = new Pilha();
    assertEquals(0, pilha.tamanho());
}


// Test Method: testTamanhoComPilhaComUmElemento
@Test
void testTamanhoComPilhaComUmElemento() {
    Pilha pilha = new Pilha();
    pilha.empilha("item");
    assertEquals(1, pilha.tamanho());
}


// Test Method: testTamanhoComPilhaComVariosElementos
@Test
void testTamanhoComPilhaComVariosElementos() {
    Pilha pilha = new Pilha();
    pilha.empilha("item1");
    pilha.empilha("item2");
    assertEquals(2, pilha.tamanho());
}


}