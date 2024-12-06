package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest{


// Test Method: testFibIterWithNegativeValue
@Test 
void testFibIterWithNegativeValue(){
 assertEquals(0, Fibonacci.fibIter(-1));
}


// Test Method: testFibIterWithZeroValue
@Test 
void testFibIterWithZeroValue(){
 assertEquals(0, Fibonacci.fibIter(0));
}


// Test Method: testFibIterWithPositiveValue
@Test 
void testFibIterWithPositiveValue(){
 assertEquals(1, Fibonacci.fibIter(1));
}


}