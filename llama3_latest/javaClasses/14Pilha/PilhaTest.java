import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest{


// Test Method: testPilhaEmptyArray
@Test
void testPilhaEmptyArray(){
    Pilha pilha = new Pilha();
    assertEquals(0, pilha.tamanho());
}



// Test Method: testPilhaOneElementArray
@Test
void testPilhaOneElementArray(){
    Pilha pilha = new Pilha();
    pilha.empilha("item");
    assertEquals(1, pilha.tamanho());
}



// Test Method: testPilhaMultipleElementsArray
@Test
void testPilhaMultipleElementsArray(){
    Pilha pilha = new Pilha();
    pilha.empilha("item1");
    pilha.empilha("item2");
    pilha.empilha("item3");
    assertEquals(3, pilha.tamanho());
}



// Test Method: testPilhaDesempilha
@Test
void testPilhaDesempilha(){
    Pilha pilha = new Pilha();
    pilha.empilha("item");
    assertEquals("item", pilha.desempilha());
}



// Test Method: testPilhaDesempilhaEmptyArray
@Test
void testPilhaDesempilhaEmptyArray(){
    Pilha pilha = new Pilha();
    try {
        pilha.desempilha();
        fail("Expected Exception");
    } catch (Exception e) {}
}



// Test Method: testPilhaVazia
@Test
void testPilhaVazia(){
    Pilha pilha = new Pilha();
    assertTrue(pilha.vazia());
}



}