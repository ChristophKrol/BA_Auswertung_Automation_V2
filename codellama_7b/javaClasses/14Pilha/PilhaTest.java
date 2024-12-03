import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest{


// Test Method: testVazia
@Test 
void testVazia(){
 assertTrue(new Pilha().vazia());
}


// Test Method: testEmpilha
@Test 
void testEmpilha(){
 Pilha pilha = new Pilha();
 Object item = new Object();
 pilha.empilha(item);
 assertFalse(pilha.vazia());
}


// Test Method: testDesempilha
@Test 
void testDesempilha(){
 Pilha pilha = new Pilha();
 Object item = new Object();
 pilha.empilha(item);
 assertEquals(item, pilha.desempilha());
}


// Test Method: testTamanho
@Test 
void testTamanho(){
 Pilha pilha = new Pilha();
 Object item1 = new Object();
 Object item2 = new Object();
 pilha.empilha(item1);
 pilha.empilha(item2);
 assertEquals(2, pilha.tamanho());
}


// Test Method: testDesempilhaVazia
@Test 
void testDesempilhaVazia(){
 Pilha pilha = new Pilha();
 assertThrows(Exception.class, () -> pilha.desempilha());
}


}