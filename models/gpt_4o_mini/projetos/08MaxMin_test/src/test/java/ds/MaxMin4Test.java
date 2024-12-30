package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMin4Test{


// Test Method: testMaxMin4_EmptyArray
@Test
public void testMaxMin4_EmptyArray() {
    int[] v = {};
    int linf = 0;
    int lsup = -1; // Set lsup lower than linf
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        MaxMin4.maxMin4(v, linf, lsup);
    });
}


// Test Method: testMaxMin4_SingleElementArray
@Test
public void testMaxMin4_SingleElementArray() {
    int[] v = {5};
    int linf = 0;
    int lsup = 0;
    int[] result = MaxMin4.maxMin4(v, linf, lsup);
    assertArrayEquals(new int[]{5, 5}, result);
}


// Test Method: testMaxMin4_TwoElementArrayAscending
@Test
public void testMaxMin4_TwoElementArrayAscending() { 
    int[] v = {1, 3};
    int linf = 0;
    int lsup = 1;
    int[] result = MaxMin4.maxMin4(v, linf, lsup);
    assertArrayEquals(new int[]{3, 1}, result);
}


// Test Method: testMaxMin4_TwoElementArrayDescending
@Test
public void testMaxMin4_TwoElementArrayDescending() { 
    int[] v = {3, 1};
    int linf = 0;
    int lsup = 1;
    int[] result = MaxMin4.maxMin4(v, linf, lsup);
    assertArrayEquals(new int[]{3, 1}, result);
}


// Test Method: testMaxMin4_MultipleElements
@Test
public void testMaxMin4_MultipleElements() {
    int[] v = {7, 1, 5, 3, 9};
    int linf = 0;
    int lsup = 4;
    int[] result = MaxMin4.maxMin4(v, linf, lsup);
    assertArrayEquals(new int[]{9, 1}, result);
}


// Test Method: testMaxMin4_NegativeAndPositiveNumbers
@Test
public void testMaxMin4_NegativeAndPositiveNumbers() {
    int[] v = {-5, -1, 2, 3, 0};
    int linf = 0;
    int lsup = 4;
    int[] result = MaxMin4.maxMin4(v, linf, lsup);
    assertArrayEquals(new int[]{3, -5}, result);
}

/*
// Test Method: testMaxMin4_BoundaryValues
@Test
public void testMaxMin4_BoundaryValues() {
    int[] v = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE};
    int linf = 0;
    int lsup = 2;
    int[] result = MaxMin4.maxMin4(v, linf, lsup);
    assertArrayEquals(new int[]{Integer.MAX_VALUE, 0}, result);
}
*/

// Test Method: testMaxMin4_SameValues
@Test
public void testMaxMin4_SameValues() {
    int[] v = {5, 5, 5, 5};
    int linf = 0;
    int lsup = 3;
    int[] result = MaxMin4.maxMin4(v, linf, lsup);
    assertArrayEquals(new int[]{5, 5}, result);
}


}