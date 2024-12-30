package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FPHeapMinTest{


// Test Method: testFPHeapMinConstructorWithSize
@Test
public void testFPHeapMinConstructorWithSize() {
    FPHeapMin heap = new FPHeapMin(10);
    assertNotNull(heap);
}


// Test Method: testFPHeapMinConstructorWithArray
@Test
public void testFPHeapMinConstructorWithArray() {
    Item[] items = new Item[]{new MeuItem(1), new MeuItem(2)};
    FPHeapMin heap = new FPHeapMin(items);
    assertEquals(1, heap.min().compara(new MeuItem(1)));
}

/*
// Test Method: testRefaz
@Test
public void testRefaz() throws Exception {
    FPHeapMin heap = new FPHeapMin(10);
    heap.insere(new MeuItem(3));
    heap.insere(new MeuItem(5));
    heap.insere(new MeuItem(2));
    heap.refaz(1, heap.n);
    assertEquals(2, heap.min().compara(new MeuItem(2)));
}


 */
/*
// Test Method: testConstroi
@Test
public void testConstroi() throws Exception {
    FPHeapMin heap = new FPHeapMin(10);
    heap.insere(new MeuItem(4));
    heap.insere(new MeuItem(3));
    heap.insere(new MeuItem(2));
    heap.insere(new MeuItem(1));
    heap.constroi();
    assertEquals(1, heap.min().compara(new MeuItem(1)));
}


 */
/*
// Test Method: testMin
@Test
public void testMin() throws Exception {
    FPHeapMin heap = new FPHeapMin(5);
    heap.insere(new MeuItem(10));
    heap.insere(new MeuItem(5));
    assertEquals(5, heap.min().compara(new MeuItem(5)));
}


 */
/*
// Test Method: testRetiraMinHeapNotEmpty
@Test
public void testRetiraMinHeapNotEmpty() throws Exception {
    FPHeapMin heap = new FPHeapMin(5);
    heap.insere(new MeuItem(1));
    heap.insere(new MeuItem(5));
    MeuItem min = (MeuItem) heap.retiraMin();
    assertEquals(1, min.compara(new MeuItem(1)));
}


 */

// Test Method: testRetiraMinHeapEmptyThrowsException
@Test
public void testRetiraMinHeapEmptyThrowsException() {
    FPHeapMin heap = new FPHeapMin(5);
    Exception exception = assertThrows(Exception.class, () -> {
        heap.retiraMin();
    });
    assertEquals("Erro: heap vazio", exception.getMessage());
}

/*
// Test Method: testDiminuiChaveWithValidKey
@Test
public void testDiminuiChaveWithValidKey() throws Exception {
    FPHeapMin heap = new FPHeapMin(5);
    MeuItem item = new MeuItem(5);
    heap.insere(item);
    heap.diminuiChave(1, 2);
    assertEquals(2, item.compara(new MeuItem(2)));
}
*/

// Test Method: testDiminuiChaveWithNullThrowsException
@Test
public void testDiminuiChaveWithNullThrowsException() throws Exception {
    FPHeapMin heap = new FPHeapMin(5);
    heap.insere(new MeuItem(5));
    Exception exception = assertThrows(Exception.class, () -> {
        heap.diminuiChave(1, null);
    });
    assertEquals("Erro: chaveNova com valor null", exception.getMessage());
}

/*
// Test Method: testInsereWithValidItem
@Test
public void testInsereWithValidItem() throws Exception {
    FPHeapMin heap = new FPHeapMin(5);
    heap.insere(new MeuItem(3));
    assertEquals(3, heap.min().compara(new MeuItem(3)));
}


 */

// Test Method: testInsereHeapFullThrowsException
@Test
public void testInsereHeapFullThrowsException() throws Exception {
    FPHeapMin heap = new FPHeapMin(2);
    heap.insere(new MeuItem(1));
    heap.insere(new MeuItem(2));
    Exception exception = assertThrows(Exception.class, () -> {
        heap.insere(new MeuItem(3));
    });
    assertEquals("Erro: heap cheio", exception.getMessage());
}


// Test Method: testImprime
@Test
public void testImprime() throws Exception {
    FPHeapMin heap = new FPHeapMin(5);
    heap.insere(new MeuItem(1));
    heap.insere(new MeuItem(2));
    assertDoesNotThrow(() -> heap.imprime());
}

/*
// Test Method: testCopia
@Test
public void testCopia() throws Exception {
    FPHeapMin heap = new FPHeapMin(5);
    Item[] items = {new MeuItem(1), new MeuItem(2), new MeuItem(3)};
    heap.copia(items);
    assertEquals(3, heap.n);
}


 */

}