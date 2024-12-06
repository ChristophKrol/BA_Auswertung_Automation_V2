package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest{


// Test Method: testEmpilhaWithValidObject
@Test
void testEmpilhaWithValidObject() throws Exception {
  Pilha pilha = new Pilha();
  Object obj = new Object();
  pilha.empilha(obj);
  assertEquals(1, pilha.tamanho());
}

/*
// Test Method: testEmpilhaWithNullObject
@Test
void testEmpilhaWithNullObject() {
  Pilha pilha = new Pilha();
  Object obj = null;
  assertThrows(Exception.class, () -> pilha.empilha(obj));
}


 */

// Test Method: testDesempilhaWithValidObject
@Test
void testDesempilhaWithValidObject() throws Exception {
  Pilha pilha = new Pilha();
  Object obj1 = new Object();
  Object obj2 = new Object();
  pilha.empilha(obj1);
  pilha.empilha(obj2);
  assertEquals(obj2, pilha.desempilha());
}


// Test Method: testDesempilhaWithEmptyPilha
@Test
void testDesempilhaWithEmptyPilha() {
  Pilha pilha = new Pilha();
  assertThrows(Exception.class, () -> pilha.desempilha());
}


// Test Method: testVazia
@Test
void testVazia() {
  Pilha pilha = new Pilha();
  assertTrue(pilha.vazia());
}


}