package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest{


// Test Method: testFibIterWithZero
@Test
void testFibIterWithZero() {
 assertEquals(0, Fibonacci.fibIter(0));
}


// Test Method: testFibIterWithOne
@Test
void testFibIterWithOne() {
 assertEquals(1, Fibonacci.fibIter(1));
}

/*
// Test Method: testFibIterWithNegativeNumber
@Test
void testFibIterWithNegativeNumber() {
 assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibIter(-1));
}
*/

// Test Method: testFibIterWithLargeNumber
@Test
void testFibIterWithLargeNumber() {
 assertEquals(144, Fibonacci.fibIter(12));
}


}