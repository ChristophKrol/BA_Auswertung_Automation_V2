import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest{


// Test Method: testMaxWithSingleElement
@Test
public void testMaxWithSingleElement() {
    Item[] items = new Item[1];
    items[0] = new MeuItem(10);
    Item result = Max.max(items, 1);
    assertEquals(10, ((MeuItem) result).chave);
}


// Test Method: testMaxWithMultipleElements
@Test
public void testMaxWithMultipleElements() {
    Item[] items = new Item[3];
    items[0] = new MeuItem(5);
    items[1] = new MeuItem(10);
    items[2] = new MeuItem(3);
    Item result = Max.max(items, 3);
    assertEquals(10, ((MeuItem) result).chave);
}


// Test Method: testMaxWithNegativeValues
@Test
public void testMaxWithNegativeValues() {
    Item[] items = new Item[3];
    items[0] = new MeuItem(-1);
    items[1] = new MeuItem(-10);
    items[2] = new MeuItem(-5);
    Item result = Max.max(items, 3);
    assertEquals(-1, ((MeuItem) result).chave);
}


// Test Method: testMaxWithBoundaryValues
@Test
public void testMaxWithBoundaryValues() {
    Item[] items = new Item[4];
    items[0] = new MeuItem(Integer.MIN_VALUE);
    items[1] = new MeuItem(0);
    items[2] = new MeuItem(Integer.MAX_VALUE);
    items[3] = new MeuItem(-1);
    Item result = Max.max(items, 4);
    assertEquals(Integer.MAX_VALUE, ((MeuItem) result).chave);
}


// Test Method: testMaxWithEqualValues
@Test
public void testMaxWithEqualValues() {
    Item[] items = new Item[3];
    items[0] = new MeuItem(1);
    items[1] = new MeuItem(1);
    items[2] = new MeuItem(1);
    Item result = Max.max(items, 3);
    assertEquals(1, ((MeuItem) result).chave);
}


// Test Method: testMaxWithMixedPositiveAndNegativeValues
@Test
public void testMaxWithMixedPositiveAndNegativeValues() { 
    Item[] items = new Item[5];
    items[0] = new MeuItem(-100);
    items[1] = new MeuItem(55);
    items[2] = new MeuItem(0);
    items[3] = new MeuItem(-1);
    items[4] = new MeuItem(100);
    Item result = Max.max(items, 5);
    assertEquals(100, ((MeuItem) result).chave);
}


// Test Method: testMaxWithNullItems
@Test
public void testMaxWithNullItems() throws NullPointerException {
    Item[] items = new Item[3];
    items[0] = null;
    items[1] = null;
    items[2] = new MeuItem(10);
    Item result = Max.max(items, 3);
    assertEquals(10, ((MeuItem) result).chave);
}


}