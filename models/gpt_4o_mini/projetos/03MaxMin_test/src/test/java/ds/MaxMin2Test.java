package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMin2Test{


// Test Method: testMaxMin2_ValidArray
@Test
public void testMaxMin2_ValidArray() {
    int[] values = {4, 2, 8, 5, 1};
    int[] result = MaxMin2.maxMin2(values, values.length);
    assertArrayEquals(new int[]{8, 1}, result);
}


// Test Method: testMaxMin2_SingleElementArray
@Test
public void testMaxMin2_SingleElementArray() {
    int[] values = {5};
    int[] result = MaxMin2.maxMin2(values, values.length);
    assertArrayEquals(new int[]{5, 5}, result);
}


// Test Method: testMaxMin2_NegativeValues
@Test
public void testMaxMin2_NegativeValues() {
    int[] values = {-3, -1, -4, -2};
    int[] result = MaxMin2.maxMin2(values, values.length);
    assertArrayEquals(new int[]{-1, -4}, result);
}


// Test Method: testMaxMin2_MixedValues
@Test
public void testMaxMin2_MixedValues() {
    int[] values = {-2, 0, 1, -1, 3};
    int[] result = MaxMin2.maxMin2(values, values.length);
    assertArrayEquals(new int[]{3, -2}, result);
}


// Test Method: testMaxMin2_IdenticalValues
@Test
public void testMaxMin2_IdenticalValues() {
    int[] values = {2, 2, 2, 2};
    int[] result = MaxMin2.maxMin2(values, values.length);
    assertArrayEquals(new int[]{2, 2}, result);
}


// Test Method: testMaxMin2_EdgeCaseEmptyArray
@Test
public void testMaxMin2_EdgeCaseEmptyArray() {
    int[] values = {};
    Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        MaxMin2.maxMin2(values, 0);
    });
}


// Test Method: testMaxMin2_TwoElementArray
@Test
public void testMaxMin2_TwoElementArray() {
    int[] values = {9, 4};
    int[] result = MaxMin2.maxMin2(values, values.length);
    assertArrayEquals(new int[]{9, 4}, result);
}


// Test Method: testMaxMin2_BoundaryValues
@Test
public void testMaxMin2_BoundaryValues() {
    int[] values = {Integer.MAX_VALUE, Integer.MIN_VALUE};
    int[] result = MaxMin2.maxMin2(values, values.length);
    assertArrayEquals(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}, result);
}


}