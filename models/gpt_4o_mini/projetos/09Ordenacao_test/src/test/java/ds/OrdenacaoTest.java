package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenacaoTest{


// Test Method: testMergeSortWithSortedArray
@Test
public void testMergeSortWithSortedArray() {
    int[] array = {1, 2, 3, 4, 5};
    Ordenacao.mergeSort(array, 0, array.length - 1);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
}


// Test Method: testMergeSortWithReverseSortedArray
@Test
public void testMergeSortWithReverseSortedArray() {
    int[] array = {5, 4, 3, 2, 1};
    Ordenacao.mergeSort(array, 0, array.length - 1);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
}


// Test Method: testMergeSortWithDuplicates
@Test
public void testMergeSortWithDuplicates() {
    int[] array = {3, 3, 2, 1, 2};
    Ordenacao.mergeSort(array, 0, array.length - 1);
    assertArrayEquals(new int[]{1, 2, 2, 3, 3}, array);
}


// Test Method: testMergeSortWithEmptyArray
@Test
public void testMergeSortWithEmptyArray() {
    int[] array = {};
    Ordenacao.mergeSort(array, 0, array.length - 1);
    assertArrayEquals(new int[]{}, array);
}


// Test Method: testMergeSortWithSingleElementArray
@Test
public void testMergeSortWithSingleElementArray() {
    int[] array = {5};
    Ordenacao.mergeSort(array, 0, array.length - 1);
    assertArrayEquals(new int[]{5}, array);
}


// Test Method: testMergeSortWithNegativeValues
@Test
public void testMergeSortWithNegativeValues() {
    int[] array = {-3, -1, -4, -2, -5};
    Ordenacao.mergeSort(array, 0, array.length - 1);
    assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, array);
}


// Test Method: testMergeSortWithMixedValues
@Test
public void testMergeSortWithMixedValues() {
    int[] array = {1, -1, 0, 5, -5};
    Ordenacao.mergeSort(array, 0, array.length - 1);
    assertArrayEquals(new int[]{-5, -1, 0, 1, 5}, array);
}


// Test Method: testMergeSortWithBoundaryValues
@Test
public void testMergeSortWithBoundaryValues() {
    int[] array = {Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
    Ordenacao.mergeSort(array, 0, array.length - 1);
    assertArrayEquals(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, array);
}


}