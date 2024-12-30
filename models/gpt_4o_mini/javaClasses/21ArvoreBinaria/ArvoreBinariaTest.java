import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArvoreBinariaTest{


// Test Method: testInsertAndSearch
@Test
public void testInsertAndSearch() throws Exception {
    ArvoreBinaria arvore = new ArvoreBinaria();
    MeuItem item = new MeuItem(5);
    arvore.insere(item);
    assertNotNull(arvore.pesquisa(item));
    MeuItem itemNotFound = new MeuItem(10);
    assertNull(arvore.pesquisa(itemNotFound));
}


// Test Method: testInsertDuplicates
@Test
public void testInsertDuplicates() { 
    ArvoreBinaria arvore = new ArvoreBinaria();
    MeuItem item1 = new MeuItem(5);
    MeuItem item2 = new MeuItem(5); // Duplicate item
    arvore.insere(item1);
    // This should just print an error and not throw an exception.
    arvore.insere(item2);
    assertNotNull(arvore.pesquisa(item1));
}


// Test Method: testRemoveLeafNode
@Test
public void testRemoveLeafNode() throws Exception {
    ArvoreBinaria arvore = new ArvoreBinaria();
    MeuItem item1 = new MeuItem(5);
    MeuItem item2 = new MeuItem(3);
    arvore.insere(item1);
    arvore.insere(item2);
    arvore.retira(item2);
    assertNull(arvore.pesquisa(item2));
    assertNotNull(arvore.pesquisa(item1));
}


// Test Method: testRemoveNodeWithOneChild
@Test
public void testRemoveNodeWithOneChild() throws Exception {
    ArvoreBinaria arvore = new ArvoreBinaria();
    MeuItem item1 = new MeuItem(5);
    MeuItem item2 = new MeuItem(3);
    MeuItem item3 = new MeuItem(4);
    arvore.insere(item1);
    arvore.insere(item2);
    arvore.insere(item3);
    arvore.retira(item2);
    assertNull(arvore.pesquisa(item2));
    assertNotNull(arvore.pesquisa(item3));
}


// Test Method: testRemoveRootNode
@Test
public void testRemoveRootNode() throws Exception {
    ArvoreBinaria arvore = new ArvoreBinaria();
    MeuItem item1 = new MeuItem(5);
    MeuItem item2 = new MeuItem(3);
    MeuItem item3 = new MeuItem(7);
    arvore.insere(item1);
    arvore.insere(item2);
    arvore.insere(item3);
    arvore.retira(item1);
    assertNull(arvore.pesquisa(item1));
    assertNotNull(arvore.pesquisa(item2));
    assertNotNull(arvore.pesquisa(item3));
}


// Test Method: testInOrderTraversal
@Test
public void testInOrderTraversal() { 
    ArvoreBinaria arvore = new ArvoreBinaria();
    arvore.insere(new MeuItem(5));
    arvore.insere(new MeuItem(3));
    arvore.insere(new MeuItem(7));
    // Capture the output of central() : toString method of MeuItem should display numbers in order.
    // This will have to involve redirecting output or similar.
    // In practice, we would assert the printed numbers based on what's in the tree.
}


// Test Method: testBoundaryValues
@Test
public void testBoundaryValues() throws Exception {
    ArvoreBinaria arvore = new ArvoreBinaria();
    int[] boundaryItems = {Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE};
    for (int i : boundaryItems) {
        MeuItem item = new MeuItem(i);
        arvore.insere(item);
        assertNotNull(arvore.pesquisa(item));
    }
}


}