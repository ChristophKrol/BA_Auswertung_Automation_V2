package ds;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AvaliaMultMatrizesTest{


// Test Method: testMultmatrizeWithEmptyArray
@Test 
void testMultmatrizeWithEmptyArray() throws IOException {
    AvaliaMultMatrizes.multmatrize(0, new int[0]);
}



// Test Method: testMultmatrizeWithOneElementArray
@Test 
void testMultmatrizeWithOneElementArray() throws IOException {
    AvaliaMultMatrizes.multmatrize(1, new int[]{0});
}


/*
// Test Method: testMultmatrizeWithMultipleElementsArray
@Test 
void testMultmatrizeWithMultipleElementsArray() throws IOException {
    AvaliaMultMatrizes.multmatrize(3, new int[]{0, 1, 2});
}

*/

// Test Method: testMultmatrizeNegativeInput
@Test 
void testMultmatrizeNegativeInput() throws IOException {
    AvaliaMultMatrizes.multmatrize(-1, new int[]{-1, 0, 1});
}


/*
// Test Method: testMultmatrizeLargeInput
@Test 
void testMultmatrizeLargeInput() throws IOException {
    AvaliaMultMatrizes.multmatrize(100, new int[]{0, 1, 2, ..., 99, 100});
}


 */


}