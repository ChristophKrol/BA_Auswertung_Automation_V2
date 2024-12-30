package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FPHeapMaxTest{

/*
// Test Method: testConstructor
@Test
public void testConstructor() {
    FPHeapMax heap = new FPHeapMax(10);
    assertNotNull(heap);
    assertNotNull(heap.v);
    assertEquals(0, heap.n);
}


 */
/*
// Test Method: testInsertAndMax
@Test
public void testInsertAndMax() throws Exception {
    FPHeapMax heap = new FPHeapMax(10);
    MeuItem item1 = new MeuItem(10);
    MeuItem item2 = new MeuItem(20);
    MeuItem item3 = new MeuItem(15);

    heap.insere(item1);
    assertEquals(1, heap.n);
    assertEquals(10, ((MeuItem)heap.max()).compara(item1));

    heap.insere(item2);
    assertEquals(2, heap.n);
    assertEquals(20, ((MeuItem)heap.max()).compara(item2));

    heap.insere(item3);
    assertEquals(3, heap.n);
    assertEquals(20, ((MeuItem)heap.max()).compara(item2));
}

 */

/*
// Test Method: testRemoveMax
@Test
public void testRemoveMax() throws Exception {
    FPHeapMax heap = new FPHeapMax(10);
    MeuItem item1 = new MeuItem(10);
    MeuItem item2 = new MeuItem(20);
    MeuItem item3 = new MeuItem(15);

    heap.insere(item1);
    heap.insere(item2);
    heap.insere(item3);

    MeuItem maxItem = (MeuItem) heap.retiraMax();
    assertEquals(20, maxItem.compara(item2));
    assertEquals(2, heap.n);
    maxItem = (MeuItem) heap.retiraMax();
    assertEquals(15, maxItem.compara(item3));
    assertEquals(1, heap.n);
    maxItem = (MeuItem) heap.retiraMax();
    assertEquals(10, maxItem.compara(item1));
    assertEquals(0, heap.n);
}


 */

// Test Method: testRetiraMaxWhenEmpty
@Test
public void testRetiraMaxWhenEmpty() {
    FPHeapMax heap = new FPHeapMax(10);
    Exception exception = assertThrows(Exception.class, () -> {
        heap.retiraMax();
    });
    assertEquals("Erro: heap vazio", exception.getMessage());
}


// Test Method: testAumentaChaveValidations
@Test
public void testAumentaChaveValidations() throws Exception {
    FPHeapMax heap = new FPHeapMax(10);
    MeuItem item1 = new MeuItem(10);
    heap.insere(item1);
    Exception exception = assertThrows(Exception.class, () -> {
        heap.aumentaChave(1, null);
    });
    assertEquals("Erro: chaveNova com valor null", exception.getMessage());
}


// Test Method: testBoundaryInsertFullHeap
@Test
public void testBoundaryInsertFullHeap() throws Exception {
    FPHeapMax heap = new FPHeapMax(1);
    MeuItem item1 = new MeuItem(10);
    MeuItem item2 = new MeuItem(20);
    heap.insere(item1);
    Exception exception = assertThrows(Exception.class, () -> {
        heap.insere(item2);
    });
    assertEquals("Erro: heap cheio", exception.getMessage());
}

/*
// Test Method: testRefazBoundaryValues
@Test
public void testRefazBoundaryValues() throws Exception {
    FPHeapMax heap = new FPHeapMax(10);
    MeuItem item1 = new MeuItem(10);
    MeuItem item2 = new MeuItem(20);

    heap.insere(item1);
    heap.insere(item2);

    // Using the reference to access elements directly for boundary testing.
    heap.refaz(1, 2);
    // Edge case: no other changes should disrupt the structure if refaz works properly.
    assertEquals(20, ((MeuItem)heap.max()).compara(item2));
}


 */
/*
// Test Method: testImprime
@Test
public void testImprime() throws Exception {
    FPHeapMax heap = new FPHeapMax(10);
    MeuItem item1 = new MeuItem(10);
    MeuItem item2 = new MeuItem(20);
    heap.insere(item1);
    heap.insere(item2);
    // Testing print might not return a value so we check the max value after print.
    heap.imprime();
    assertEquals(20, ((MeuItem)heap.max()).compara(item2));
}


 */

}