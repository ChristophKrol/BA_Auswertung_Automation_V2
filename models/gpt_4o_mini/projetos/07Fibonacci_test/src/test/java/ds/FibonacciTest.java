package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest{


// Test Method: testFibIter_PositiveValue
@Test
public void testFibIter_PositiveValue() {
    int result = Fibonacci.fibIter(5);
    assertEquals(5, result);
}


// Test Method: testFibIter_ZeroValue
@Test
public void testFibIter_ZeroValue() {
    int result = Fibonacci.fibIter(0);
    assertEquals(0, result);
}

/*
// Test Method: testFibIter_NegativeValue
@Test
public void testFibIter_NegativeValue() {
    assertThrows(IllegalArgumentException.class, () -> {
        Fibonacci.fibIter(-1);
    });
}


 */

// Test Method: testFibIter_BoundaryValue_One
@Test
public void testFibIter_BoundaryValue_One() {
    int result = Fibonacci.fibIter(1);
    assertEquals(1, result);
}


// Test Method: testFibIter_BoundaryValue_Two
@Test
public void testFibIter_BoundaryValue_Two() {
    int result = Fibonacci.fibIter(2);
    assertEquals(1, result);
}


// Test Method: testFibIter_LargeValue
@Test
public void testFibIter_LargeValue() {
    int result = Fibonacci.fibIter(30);
    assertEquals(832040, result);
}


}