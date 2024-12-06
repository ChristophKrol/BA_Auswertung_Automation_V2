package ds;

import ds.AvaliaMultMatrizes;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AvaliaMultMatrizesTest{


// Test Method: testMultMatrizeWithEmptyMatrix
@Test
void testMultMatrizeWithEmptyMatrix() throws IOException {
    int n = 0;
    int[] d = {};
    AvaliaMultMatrizes.multmatrize(n, d);
}



// Test Method: testMultMatrizeWithOneElementMatrix
@Test
void testMultMatrizeWithOneElementMatrix() throws IOException {
    int n = 1;
    int[] d = {1};
    AvaliaMultMatrizes.multmatrize(n, d);
}


/*
// Test Method: testMultMatrizeWithMultipleElementsMatrix
@Test
void testMultMatrizeWithMultipleElementsMatrix() throws IOException {
    int n = 3;
    int[] d = {1, 2, 3};
    AvaliaMultMatrizes.multmatrize(n, d);
}
*/

/*
// Test Method: testMultMatrizeWithNegativeDimensions
@Test
void testMultMatrizeWithNegativeDimensions() throws IOException {
    int n = -1;
    int[] d = {};
    try {
      AvaliaMultMatrizes.multmatrize(n, d);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // Expected exception
    }
}
*/

/*
// Test Method: testMultMatrizeWithNullDimensions
@Test
void testMultMatrizeWithNullDimensions() throws IOException {
    int n = null;
    int[] d = {};
    try {
      AvaliaMultMatrizes.multmatrize(n, d);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // Expected exception
    }
}
*/


}