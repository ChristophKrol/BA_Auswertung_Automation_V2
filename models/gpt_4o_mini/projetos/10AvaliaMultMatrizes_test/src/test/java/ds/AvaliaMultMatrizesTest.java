package ds;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AvaliaMultMatrizesTest{


// Test Method: testMultmatrize_Normal
@Test
public void testMultmatrize_Normal() throws IOException {
    int n = 3;
    int[] d = {10, 20, 30, 40};
    AvaliaMultMatrizes.multmatrize(n, d);
}


// Test Method: testMultmatrize_BoundaryZero
@Test
public void testMultmatrize_BoundaryZero() throws IOException {
    int n = 0;
    int[] d = {};
    AvaliaMultMatrizes.multmatrize(n, d);
}


// Test Method: testMultmatrize_BoundaryOne
@Test
public void testMultmatrize_BoundaryOne() throws IOException {
    int n = 1;
    int[] d = {10, 20};
    AvaliaMultMatrizes.multmatrize(n, d);
}


// Test Method: testMultmatrize_NegativeValues
@Test
public void testMultmatrize_NegativeValues() throws IOException {
    int n = 3;
    int[] d = {-1, -2, -3, -4};
    AvaliaMultMatrizes.multmatrize(n, d);
}


// Test Method: testMultmatrize_LargeNumbers
@Test
public void testMultmatrize_LargeNumbers() throws IOException {
    int n = 3;
    int[] d = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
    AvaliaMultMatrizes.multmatrize(n, d);
}


// Test Method: testMultmatrize_EmptyArray
@Test
public void testMultmatrize_EmptyArray() throws IOException {
    int n = 0;
    int[] d = {};
    try {
        AvaliaMultMatrizes.multmatrize(n, d);
    } catch (Exception e) {
        // Handle exception or assert for expected behavior.
        assertTrue(e instanceof ArrayIndexOutOfBoundsException);
    }
}


}