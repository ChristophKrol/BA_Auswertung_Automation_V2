package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest{


// Test Method: testEmpilhaWithFullStack
@Test 
void testEmpilhaWithFullStack() throws Exception {
  Pilha pilha = new Pilha();
  for (int i=0; i<1000; i++) { pilha.empilha(new Object()); }
  try { pilha.empilha(new Object()); assertTrue(false); } catch (Exception e) { assertEquals("Erro: A pilha esta cheia", e.getMessage()); }
}



// Test Method: testDesempilhaWithEmptyStack
@Test 
void testDesempilhaWithEmptyStack() throws Exception {
  Pilha pilha = new Pilha();
  try { pilha.desempilha(); assertTrue(false); } catch (Exception e) { assertEquals("Erro: A pilha esta vazia", e.getMessage()); }
}



// Test Method: testVaziaWithEmptyStack
@Test 
void testVaziaWithEmptyStack() {
  Pilha pilha = new Pilha();
  assertTrue(pilha.vazia());
}



// Test Method: testVaziaWithNonEmptyStack
@Test 
void testVaziaWithNonEmptyStack() throws Exception {
  Pilha pilha = new Pilha();
  pilha.empilha(new Object());
  assertFalse(pilha.vazia());
}



// Test Method: testTamanhoWithEmptyStack
@Test 
void testTamanhoWithEmptyStack() {
  Pilha pilha = new Pilha();
  assertEquals(0, pilha.tamanho());
}



// Test Method: testTamanhoWithNonEmptyStack
@Test 
void testTamanhoWithNonEmptyStack() throws Exception {
  Pilha pilha = new Pilha();
  pilha.empilha(new Object());
  assertEquals(1, pilha.tamanho());
}



}