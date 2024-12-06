import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenacaoTest{


// Test Method: testMergeSortWithEmptyArray
@Test
void testMergeSortWithEmptyArray() {
 assertEquals(new int[0], Ordenacao.mergeSort(new int[0], 0, -1));
}


// Test Method: testMergeSortWithSingleElementArray
@Test
void testMergeSortWithSingleElementArray() {
 int[] v = {5};
 int[] expected = {5};
 assertEquals(expected, Ordenacao.mergeSort(v, 0, 0));
}


// Test Method: testMergeSortWithMultipleElementsArray
@Test
void testMergeSortWithMultipleElementsArray() {
 int[] v = {5, 2, 4, 6, 1};
 int[] expected = {1, 2, 4, 5, 6};
 assertEquals(expected, Ordenacao.mergeSort(v, 0, v.length - 1));
}


// Test Method: testMergeSortWithNegativeValues
@Test
void testMergeSortWithNegativeValues() {
 int[] v = {-5, -2, -4, -6, -1};
 int[] expected = {-6, -5, -4, -2, -1};
 assertEquals(expected, Ordenacao.mergeSort(v, 0, v.length - 1));
}


// Test Method: testMergeSortWithBoundaryValues
@Test
void testMergeSortWithBoundaryValues() {
 int[] v = {Integer.MIN_VALUE, Integer.MAX_VALUE};
 int[] expected = {Integer.MIN_VALUE, Integer.MAX_VALUE};
 assertEquals(expected, Ordenacao.mergeSort(v, 0, v.length - 1));
}


// Test Method: testMergeSortWithException
@Test
void testMergeSortWithException() {
 assertThrows(IndexOutOfBoundsException.class, () -> {
 Ordenacao.mergeSort(new int[0], 0, 1);
});
}


}