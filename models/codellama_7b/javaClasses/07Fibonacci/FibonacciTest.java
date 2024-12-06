import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest{


// Test Method: testFibIterWithNegativeNumber
@Test 
void testFibIterWithNegativeNumber(){
 assertEquals(0, Fibonacci.fibIter(-1));
}


// Test Method: testFibIterWithZero
@Test 
void testFibIterWithZero(){
 assertEquals(0, Fibonacci.fibIter(0));
}


// Test Method: testFibIterWithOne
@Test 
void testFibIterWithOne(){
 assertEquals(1, Fibonacci.fibIter(1));
}


// Test Method: testFibIterWithTwo
@Test 
void testFibIterWithTwo(){
 assertEquals(1, Fibonacci.fibIter(2));
}


// Test Method: testFibIterWithThree
@Test 
void testFibIterWithThree(){
 assertEquals(2, Fibonacci.fibIter(3));
}


// Test Method: testFibIterWithFour
@Test 
void testFibIterWithFour(){
 assertEquals(3, Fibonacci.fibIter(4));
}


// Test Method: testFibIterWithFive
@Test 
void testFibIterWithFive(){
 assertEquals(5, Fibonacci.fibIter(5));
}


// Test Method: testFibIterWithSix
@Test 
void testFibIterWithSix(){
 assertEquals(8, Fibonacci.fibIter(6));
}


}