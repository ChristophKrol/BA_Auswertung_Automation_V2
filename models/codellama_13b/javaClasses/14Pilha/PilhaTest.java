import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest{


// Test Method: testEmpilhaWithNullItem
@Test
void testEmpilhaWithNullItem() {
  Pilha pilha = new Pilha();
  assertThrows(Exception.class, () -> pilha.empilha(null));
}


// Test Method: testDesempilhaWithEmptyStack
@Test
void testDesempilhaWithEmptyStack() {
  Pilha pilha = new Pilha();
  assertThrows(Exception.class, () -> pilha.desempilha());
}


// Test Method: testEmpilhaAndDesempilha
@Test
void testEmpilhaAndDesempilha() {
  Pilha pilha = new Pilha();
  Object item1 = new Object();
  Object item2 = new Object();
  pilha.empilha(item1);
  pilha.empilha(item2);
  assertEquals(pilha.desempilha(), item2);
  assertEquals(pilha.desempilha(), item1);
}


// Test Method: testVazia
@Test
void testVazia() {
  Pilha pilha = new Pilha();
  assertTrue(pilha.vazia());
  Object item1 = new Object();
  Object item2 = new Object();
  pilha.empilha(item1);
  pilha.empilha(item2);
  assertFalse(pilha.vazia());
}


// Test Method: testTamanho
@Test
void testTamanho() {
  Pilha pilha = new Pilha();
  Object item1 = new Object();
  Object item2 = new Object();
  pilha.empilha(item1);
  pilha.empilha(item2);
  assertEquals(pilha.tamanho(), 2);
}


}