package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest{


// Test Method: testFibIterPositiveBoundaryCaseZero
@Test
public void testFibIterPositiveBoundaryCaseZero() {
    int result = Fibonacci.fibIter(0);
    assertEquals(0, result);
}


// Test Method: testFibIterPositiveBoundaryCaseOne
@Test
public void testFibIterPositiveBoundaryCaseOne() {
    int result = Fibonacci.fibIter(1);
    assertEquals(1, result);
}


// Test Method: testFibIterPositiveValues
@Test
public void testFibIterPositiveValues() {
    assertEquals(5, Fibonacci.fibIter(5));
    assertEquals(21, Fibonacci.fibIter(8));
}

/*
// Test Method: testFibIterNegativeValues
@Test
public void testFibIterNegativeValues() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        Fibonacci.fibIter(-1);
    });
    assertEquals("Input must be non-negative.", exception.getMessage());
}


 */

// Test Method: testFibIterLargeInput
@Test
public void testFibIterLargeInput() throws Exception {
    int result = Fibonacci.fibIter(30);
    assertEquals(832040, result);
}


// Test Method: testFibIterLoopConditionFalse
@Test
public void testFibIterLoopConditionFalse() {
    int result = Fibonacci.fibIter(2);
    assertEquals(1, result);
}


// Test Method: testFibIterLoopEmptyCondition
@Test
public void testFibIterLoopEmptyCondition() {
    int result = Fibonacci.fibIter(3);
    assertEquals(2, result);
}


}