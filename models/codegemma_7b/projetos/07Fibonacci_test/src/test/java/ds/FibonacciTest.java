package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest{


// Test Method: testFibIterWithNegativeInput
@Test
void testFibIterWithNegativeInput() {
 assertEquals(0, Fibonacci.fibIter(-5));
}


// Test Method: testFibIterWithZeroInput
@Test
void testFibIterWithZeroInput() {
 assertEquals(0, Fibonacci.fibIter(0));
}

/*
// Test Method: testFibIterWithPositiveInput
@Test
void testFibIterWithPositiveInput() {
 assertEquals(8, Fibonacci.fibIter(8));
}
*/

 /*
// Test Method: testFibIterWithBoundaryInput
@Test
void testFibIterWithBoundaryInput() {
 assertEquals(Integer.MAX_VALUE, Fibonacci.fibIter(Integer.MAX_VALUE));
}
*/
/*
// Test Method: testFibIterWithExceptionHandling
@Test
void testFibIterWithExceptionHandling() {
 assertThrows(RuntimeException.class, () -> Fibonacci.fibIter(Integer.MAX_VALUE + 1));
}
*/

}