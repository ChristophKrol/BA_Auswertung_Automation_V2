import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest{


// Test Method: testEmpilhaAndDesempilha
@Test 
void testEmpilhaAndDesempilha() throws Exception {
  Pilha pilha = new Pilha();
  pilha.empilha(1);
  assertEquals(1, pilha.desempilha());
}


// Test Method: testDesempilhaEmptyStackException
@Test (expected = Exception.class)
void testDesempilhaEmptyStackException() throws Exception {
  Pilha pilha = new Pilha();
  pilha.desempilha();
}


// Test Method: testVaziaMethod
@Test 
void testVaziaMethod() {
  Pilha pilha = new Pilha();
  assertTrue(pilha.vazia());
}


// Test Method: testTamanhoMethod
@Test 
void testTamanhoMethod() {
  Pilha pilha = new Pilha();
  assertEquals(0, pilha.tamanho());
}


}