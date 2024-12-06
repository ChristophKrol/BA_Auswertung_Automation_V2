import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest{


// Test Method: testFibIterWithNegativeInput
@Test 
void testFibIterWithNegativeInput() throws Exception {
 assertEquals(0, Fibonacci.fibIter(-1));
}


// Test Method: testFibIterWithZeroInput
@Test 
void testFibIterWithZeroInput() throws Exception {
 assertEquals(0, Fibonacci.fibIter(0));
}


// Test Method: testFibIterWithOneInput
@Test 
void testFibIterWithOneInput() throws Exception {
 assertEquals(1, Fibonacci.fibIter(1));
}


// Test Method: testFibIterWithTwoInput
@Test 
void testFibIterWithTwoInput() throws Exception {
 assertEquals(1, Fibonacci.fibIter(2));
}


// Test Method: testFibIterWithThreeInput
@Test 
void testFibIterWithThreeInput() throws Exception {
 assertEquals(2, Fibonacci.fibIter(3));
}


// Test Method: testFibIterWithLargeInput
@Test 
void testFibIterWithLargeInput() throws Exception {
 assertEquals(13, Fibonacci.fibIter(8));
}


}