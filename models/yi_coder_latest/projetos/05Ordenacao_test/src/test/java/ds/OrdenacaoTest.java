package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenacaoTest{


// Test Method: testOrdenaWithEmptyArray
@Test 
void testOrdenaWithEmptyArray(){
 int[] array = new int[0];
 Ordenacao.ordena(array, 0);
 assertArrayEquals(new int[0], array);
}


// Test Method: testOrdenaWithOneElementArray
@Test 
void testOrdenaWithOneElementArray(){
 int[] array = {1};
 Ordenacao.ordena(array, 1);
 assertArrayEquals(new int[]{1}, array);
}


// Test Method: testOrdenaWithMultipleElementsArrayInOrder
@Test 
void testOrdenaWithMultipleElementsArrayInOrder(){
 int[] array = {1, 2, 3};
 Ordenacao.ordena(array, 3);
 assertArrayEquals(new int[]{1, 2, 3}, array);
}


// Test Method: testOrdenaWithMultipleElementsArrayNotInOrder
@Test 
void testOrdenaWithMultipleElementsArrayNotInOrder(){
 int[] array = {3, 2, 1};
 Ordenacao.ordena(array, 3);
 assertArrayEquals(new int[]{1, 2, 3}, array);
}


// Test Method: testOrdenaWithMultipleElementsArrayRandomOrder
@Test 
void testOrdenaWithMultipleElementsArrayRandomOrder(){
 int[] array = {5, 1, 9, 3, 7};
 Ordenacao.ordena(array, 5);
 assertArrayEquals(new int[]{1, 3, 5, 7, 9}, array);
}


}