package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest{

/*
// Test Method: testFibIterWithNegativeNumber
@Test 
void testFibIterWithNegativeNumber() throws Exception {
  try {
     Fibonacci.fibIter(-1);
    fail("Expected an IllegalArgumentException to be thrown.");
   } catch (IllegalArgumentException exception) {}
}


 */

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


// Test Method: testFibIterWithTwo
@Test 
void testFibIterWithTwo() {
 assertEquals(1, Fibonacci.fibIter(2));
}


// Test Method: testFibIterWithThree
@Test 
void testFibIterWithThree() {
 assertEquals(2, Fibonacci.fibIter(3));
}


// Test Method: testFibIterWithTen
@Test 
void testFibIterWithTen() {
 assertEquals(55, Fibonacci.fibIter(10));
}


}