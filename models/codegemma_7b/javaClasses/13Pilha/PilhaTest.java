import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest{


// Test Method: testEmpilhaComPilhaVazia
@Test
void testEmpilhaComPilhaVazia() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("a");
    assertEquals("a", pilha.desempilha());
}


// Test Method: testEmpilhaComPilhaCheia
@Test
void testEmpilhaComPilhaCheia() throws Exception {
    Pilha pilha = new Pilha();
    for (int i = 0; i < 1000; i++) {
      pilha.empilha(i);
    }
    try {
      pilha.empilha(1000);
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


// Test Method: testTamanhoComPilhaComElementos
@Test
void testTamanhoComPilhaComElementos() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("a");
    pilha.empilha("b");
    assertEquals(2, pilha.tamanho());
}


// Test Method: testVaziaComPilhaVazia
@Test
void testVaziaComPilhaVazia() {
    Pilha pilha = new Pilha();
    assertTrue(pilha.vazia());
}


// Test Method: testVaziaComPilhaComElementos
@Test
void testVaziaComPilhaComElementos() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("a");
    assertFalse(pilha.vazia());
}


}