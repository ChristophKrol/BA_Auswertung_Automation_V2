package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMin1Test{


// Test Method: testMaxMin1_ValidInputs
@Test
public void testMaxMin1_ValidInputs() {
    int[] values = {1, 2, 3, 4, 5};
    int n = values.length;
    int[] result = MaxMin1.maxMin1(values, n);
    assertEquals(5, result[0]); // max
    assertEquals(1, result[1]); // min
}


// Test Method: testMaxMin1_SingleElement
@Test
public void testMaxMin1_SingleElement() {
    int[] values = {10};
    int n = values.length;
    int[] result = MaxMin1.maxMin1(values, n);
    assertEquals(10, result[0]); // max
    assertEquals(10, result[1]); // min
}


// Test Method: testMaxMin1_NegativeValues
@Test
public void testMaxMin1_NegativeValues() {
    int[] values = {-10, -20, -30, -40};
    int n = values.length;
    int[] result = MaxMin1.maxMin1(values, n);
    assertEquals(-10, result[0]); // max
    assertEquals(-40, result[1]); // min
}


// Test Method: testMaxMin1_MixedValues
@Test
public void testMaxMin1_MixedValues() {
    int[] values = {-1, 0, 1, -2, 2};
    int n = values.length;
    int[] result = MaxMin1.maxMin1(values, n);
    assertEquals(2, result[0]); // max
    assertEquals(-2, result[1]); // min
}


// Test Method: testMaxMin1_ZeroElements
@Test
public void testMaxMin1_ZeroElements() throws Exception {
    int[] values = {};
    int n = 0;
    try {
        MaxMin1.maxMin1(values, n);
    } catch (ArrayIndexOutOfBoundsException e) {
        // Expected; test should pass
    }
}


// Test Method: testMaxMin1_BoundaryValues
@Test
public void testMaxMin1_BoundaryValues() {
    int[] values = {Integer.MIN_VALUE, Integer.MAX_VALUE};
    int n = values.length;
    int[] result = MaxMin1.maxMin1(values, n);
    assertEquals(Integer.MAX_VALUE, result[0]); // max
    assertEquals(Integer.MIN_VALUE, result[1]); // min
}


}