package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMin3Test{


// Test Method: testMaxMin3WithEvenLengthArray
@Test
public void testMaxMin3WithEvenLengthArray() throws Exception {
    int[] input = {5, 1, 3, 2};
    int[] result = MaxMin3.maxMin3(input, input.length);
    assertArrayEquals(new int[]{5, 1}, result);
}

/**
// Test Method: testMaxMin3WithOddLengthArray
@Test
public void testMaxMin3WithOddLengthArray() throws Exception {
    int[] input = {10, 3, 5};
    int[] result = MaxMin3.maxMin3(input, input.length);
    assertArrayEquals(new int[]{10, 3}, result);
}

*/
/*
// Test Method: testMaxMin3WithSingleElementArray
@Test
public void testMaxMin3WithSingleElementArray() throws Exception {
    int[] input = {7};
    int[] result = MaxMin3.maxMin3(input, input.length);
    assertArrayEquals(new int[]{7, 7}, result);
}


 */

// Test Method: testMaxMin3WithNegativeNumbers
@Test
public void testMaxMin3WithNegativeNumbers() throws Exception {
    int[] input = {-1, -3, -2, -4};
    int[] result = MaxMin3.maxMin3(input, input.length);
    assertArrayEquals(new int[]{-1, -4}, result);
}


// Test Method: testMaxMin3WithBoundaryValues
@Test
public void testMaxMin3WithBoundaryValues() throws Exception {
    int[] input = {Integer.MAX_VALUE, Integer.MIN_VALUE};
    int[] result = MaxMin3.maxMin3(input, input.length);
    assertArrayEquals(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}, result);
}


// Test Method: testMaxMin3WithIdenticalElements
@Test
public void testMaxMin3WithIdenticalElements() throws Exception {
    int[] input = {2, 2, 2, 2};
    int[] result = MaxMin3.maxMin3(input, input.length);
    assertArrayEquals(new int[]{2, 2}, result);
}

/*
// Test Method: testMaxMin3WithMixedNegativeAndPositive
@Test
public void testMaxMin3WithMixedNegativeAndPositive() throws Exception {
    int[] input = {-5, 10, 0, -1, 1};
    int[] result = MaxMin3.maxMin3(input, input.length);
    assertArrayEquals(new int[]{10, -5}, result);
}


 */

// Test Method: testMaxMin3WithLargeArray
@Test
public void testMaxMin3WithLargeArray() throws Exception {
    int[] input = {1000, 2000, 500, 700, 3000, 100};
    int[] result = MaxMin3.maxMin3(input, input.length);
    assertArrayEquals(new int[]{3000, 100}, result);
}


// Test Method: testMaxMin3WithEmptyArray
@Test
public void testMaxMin3WithEmptyArray() throws Exception {
    int[] input = {};
    Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        MaxMin3.maxMin3(input, input.length);
    });
    assertNotNull(exception);
}


// Test Method: testMaxMin3WithSinglePairArray
@Test
public void testMaxMin3WithSinglePairArray() throws Exception {
    int[] input = {3, 1};
    int[] result = MaxMin3.maxMin3(input, input.length);
    assertArrayEquals(new int[]{3, 1}, result);
}


}