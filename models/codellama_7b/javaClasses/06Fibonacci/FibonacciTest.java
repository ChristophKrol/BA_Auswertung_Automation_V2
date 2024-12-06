import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest{


// Test Method: testFibIterWithNegativeInput
@Test 
void testFibIterWithNegativeInput(){
 assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibIter(-1));
}


// Test Method: testFibIterWithZeroInput
@Test 
void testFibIterWithZeroInput(){
 assertEquals(0, Fibonacci.fibIter(0));
}


// Test Method: testFibIterWithOneInput
@Test 
void testFibIterWithOneInput(){
 assertEquals(1, Fibonacci.fibIter(1));
}


// Test Method: testFibIterWithTwoInput
@Test 
void testFibIterWithTwoInput(){
 assertEquals(1, Fibonacci.fibIter(2));
}


// Test Method: testFibIterWithThreeInput
@Test 
void testFibIterWithThreeInput(){
 assertEquals(2, Fibonacci.fibIter(3));
}


// Test Method: testFibIterWithFourInput
@Test 
void testFibIterWithFourInput(){
 assertEquals(3, Fibonacci.fibIter(4));
}


// Test Method: testFibIterWithFiveInput
@Test 
void testFibIterWithFiveInput(){
 assertEquals(5, Fibonacci.fibIter(5));
}


// Test Method: testFibIterWithSixInput
@Test 
void testFibIterWithSixInput(){
 assertEquals(8, Fibonacci.fibIter(6));
}


}