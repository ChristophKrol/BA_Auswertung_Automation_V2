import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenacaoTest{


// Test Method: testOrdenaWithEmptyArray
@Test
void testOrdenaWithEmptyArray() {
 assertTrue(true);
}


// Test Method: testOrdenaWithOneElementArray
@Test
void testOrdenaWithOneElementArray() {
 int[] v = {1};
 Ordenacao.ordena(v, 1);
 assertEquals(1, v[0]);
}


// Test Method: testOrdenaWithMultipleElementsArray
@Test
void testOrdenaWithMultipleElementsArray() {
 int[] v = {3, 2, 1};
 Ordenacao.ordena(v, 3);
 assertEquals(1, v[0]);
 assertEquals(2, v[1]);
 assertEquals(3, v[2]);
}


// Test Method: testOrdenaWithNegativeValues
@Test
void testOrdenaWithNegativeValues() {
 int[] v = {-3, -2, -1};
 Ordenacao.ordena(v, 3);
 assertEquals(-3, v[0]);
 assertEquals(-2, v[1]);
 assertEquals(-1, v[2]);
}


// Test Method: testOrdenaWithBoundaryValues
@Test
void testOrdenaWithBoundaryValues() {
 int[] v = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE};
 Ordenacao.ordena(v, 3);
 assertEquals(Integer.MIN_VALUE, v[0]);
 assertEquals(0, v[1]);
 assertEquals(Integer.MAX_VALUE, v[2]);
}


// Test Method: testOrdenaWithNullPointerException
@Test
void testOrdenaWithNullPointerException() {
 int[] v = null;
 try {
 Ordenacao.ordena(v, 0);
 fail("Expected NullPointerException");
 } catch (NullPointerException e) {
 // Expected
 }
}


}