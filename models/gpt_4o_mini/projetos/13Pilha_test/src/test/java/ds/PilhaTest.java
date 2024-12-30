package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest{


// Test Method: testEmpilha_ShouldThrowException_WhenPilhaIsFull
@Test
public void testEmpilha_ShouldThrowException_WhenPilhaIsFull() throws Exception {
    Pilha pilha = new Pilha();
    // Fill the stack to its limit
    for (int i = 0; i < 1000; i++) {
        pilha.empilha(i);
    }
    Exception exception = assertThrows(Exception.class, () -> {
        pilha.empilha(1001);
    });
    assertEquals("Erro: A pilha esta cheia", exception.getMessage());
}


// Test Method: testDesempilha_ShouldThrowException_WhenPilhaIsEmpty
@Test
public void testDesempilha_ShouldThrowException_WhenPilhaIsEmpty() throws Exception {
    Pilha pilha = new Pilha();
    Exception exception = assertThrows(Exception.class, () -> {
        pilha.desempilha();
    });
    assertEquals("Erro: A pilha esta vazia", exception.getMessage());
}


// Test Method: testVazia_ShouldReturnTrue_WhenPilhaIsEmpty
@Test
public void testVazia_ShouldReturnTrue_WhenPilhaIsEmpty() {
    Pilha pilha = new Pilha();
    assertTrue(pilha.vazia());
}


// Test Method: testVazia_ShouldReturnFalse_WhenPilhaIsNotEmpty
@Test
public void testVazia_ShouldReturnFalse_WhenPilhaIsNotEmpty() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha(new Object());
    assertFalse(pilha.vazia());
}


// Test Method: testTamanho_ShouldReturnCorrectSize_WhenItemsAreAdded
@Test
public void testTamanho_ShouldReturnCorrectSize_WhenItemsAreAdded() throws Exception {
    Pilha pilha = new Pilha();
    assertEquals(0, pilha.tamanho());
    pilha.empilha(new Object());
    assertEquals(1, pilha.tamanho());
    pilha.empilha(new Object());
    assertEquals(2, pilha.tamanho());
    pilha.desempilha();
    assertEquals(1, pilha.tamanho());
}


// Test Method: testEmpilha_ShouldAddItem_WhenStackIsNotFull
@Test
public void testEmpilha_ShouldAddItem_WhenStackIsNotFull() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("item1");
    assertEquals("item1", pilha.item[0]);
    pilha.empilha("item2");
    assertEquals("item2", pilha.item[1]);
}


// Test Method: testDesempilha_ShouldReturnLastItem_WhenPilhaHasItems
@Test
public void testDesempilha_ShouldReturnLastItem_WhenPilhaHasItems() throws Exception {
    Pilha pilha = new Pilha();
    pilha.empilha("item1");
    pilha.empilha("item2");
    assertEquals("item2", pilha.desempilha());
    assertEquals("item1", pilha.desempilha());
}


// Test Method: testBoundaryValues
@Test
public void testBoundaryValues() throws Exception {
    Pilha pilha = new Pilha();
    for (int i = 0; i < 999; i++) {
        pilha.empilha(i);
    }
    assertFalse(pilha.vazia());
    pilha.desempilha(); // Test removing the last item
    assertEquals(998, pilha.tamanho());
}


}