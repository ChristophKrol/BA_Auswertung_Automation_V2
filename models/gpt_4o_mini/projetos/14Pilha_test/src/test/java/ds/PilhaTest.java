package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest{


// Test Method: testEmpilhaAndTamanho
@Test
public void testEmpilhaAndTamanho() {
    Pilha pilha = new Pilha();
    assertEquals(0, pilha.tamanho());
    pilha.empilha("item1");
    assertEquals(1, pilha.tamanho());
    pilha.empilha("item2");
    assertEquals(2, pilha.tamanho());
    pilha.empilha("item3");
    assertEquals(3, pilha.tamanho());
}


// Test Method: testDesempilha
@Test
public void testDesempilha() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("item1");
    pilha.empilha("item2");
    
    assertEquals("item2", pilha.desempilha());
    assertEquals(1, pilha.tamanho());
    
    assertEquals("item1", pilha.desempilha());
    assertEquals(0, pilha.tamanho());
}


// Test Method: testDesempilhaVazia
@Test
public void testDesempilhaVazia() {
    Pilha pilha = new Pilha();
    Exception exception = assertThrows(Exception.class, () -> {
        pilha.desempilha();
    });
    assertEquals("Erro: A pilha esta vazia", exception.getMessage());
}


// Test Method: testVazia
@Test
public void testVazia() throws Exception {
    Pilha pilha = new Pilha();
    assertTrue(pilha.vazia());
    pilha.empilha("item1");
    assertFalse(pilha.vazia());
    pilha.desempilha();
    assertTrue(pilha.vazia());
}

/*
// Test Method: testBoundaryTamanho
@Test
public void testBoundaryTamanho() throws Exception {
    Pilha pilha = new Pilha();
    assertEquals(0, pilha.tamanho());  
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
        pilha.empilha(i);
    }
    assertEquals(Integer.MAX_VALUE, pilha.tamanho());
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
        pilha.desempilha();
    }
    assertEquals(0, pilha.tamanho());
}


 */

// Test Method: testMultipleEmpilhaAndDesempilha
@Test
public void testMultipleEmpilhaAndDesempilha() throws Exception {
    Pilha pilha = new Pilha();
    for (int i = 0; i < 100; i++) {
        pilha.empilha(i);
    }
    for (int i = 99; i >= 0; i--) {
        assertEquals(i, pilha.desempilha());
    }
    assertTrue(pilha.vazia());
}


}