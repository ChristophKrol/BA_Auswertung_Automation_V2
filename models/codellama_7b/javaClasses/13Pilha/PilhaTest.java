import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest{


// Test Method: testVazia
@Test 
void testVazia(){
 Pilha pilha = new Pilha();
 assertTrue(pilha.vazia());
}


// Test Method: testEmpilha
@Test 
void testEmpilha(){
 Pilha pilha = new Pilha();
 pilha.empilha(1);
 assertFalse(pilha.vazia());
}


// Test Method: testDesempilha
@Test 
void testDesempilha(){
 Pilha pilha = new Pilha();
 pilha.empilha(1);
 assertEquals(1, pilha.desempilha());
}


// Test Method: testTamanho
@Test 
void testTamanho(){
 Pilha pilha = new Pilha();
 pilha.empilha(1);
 assertEquals(1, pilha.tamanho());
}


// Test Method: testEmpilhaLimite
@Test 
void testEmpilhaLimite(){
 Pilha pilha = new Pilha();
 for (int i = 0; i < 1000; i++) pilha.empilha(i);
 assertEquals(1000, pilha.tamanho());
}


// Test Method: testDesempilhaLimite
@Test 
void testDesempilhaLimite(){
 Pilha pilha = new Pilha();
 for (int i = 0; i < 1000; i++) pilha.empilha(i);
 for (int i = 0; i < 1000; i++) assertEquals(i, pilha.desempilha());
}


}