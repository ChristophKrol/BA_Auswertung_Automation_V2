package ds;

import ds.Pilha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest{


// Test Method: testPilhaEmptyArray
@Test
void testPilhaEmptyArray(){
    Pilha pilha = new Pilha();
    assertEquals(0, pilha.tamanho());
}



// Test Method: testPilhaPushOneElement
@Test
void testPilhaPushOneElement() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("item");
    assertEquals(1, pilha.tamanho());
}



// Test Method: testPilhaPopOneElement
@Test
void testPilhaPopOneElement() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("item");
    assertEquals("item", pilha.desempilha());
}



// Test Method: testPilhaPushMultipleElements
@Test
void testPilhaPushMultipleElements() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("item1");
    pilha.empilha("item2");
    pilha.empilha("item3");
    assertEquals(3, pilha.tamanho());
}



// Test Method: testPilhaPopMultipleElements
@Test
void testPilhaPopMultipleElements() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("item1");
    pilha.empilha("item2");
    pilha.empilha("item3");
    assertEquals("item3", pilha.desempilha());
}



// Test Method: testPilhaEmptyArrayVazia
@Test
void testPilhaEmptyArrayVazia(){
    Pilha pilha = new Pilha();
    assertTrue(pilha.vazia());
}



// Test Method: testPilhaNotEmptyArray
@Test
void testPilhaNotEmptyArray() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("item");
    assertFalse(pilha.vazia());
}



}