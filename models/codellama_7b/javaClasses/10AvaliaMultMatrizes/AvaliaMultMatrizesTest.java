import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvaliaMultMatrizesTest{


// Test Method: testMultmatrizeWithEmptyArray
@Test 
void testMultmatrizeWithEmptyArray() throws IOException {
 assertNull(AvaliaMultMatrizes.multmatrize(0, new int[0]));
}


// Test Method: testMultmatrizeWithOneElementArray
@Test 
void testMultmatrizeWithOneElementArray() throws IOException {
 assertEquals(1, AvaliaMultMatrizes.multmatrize(1, new int[]{1}));
}


// Test Method: testMultmatrizeWithMultipleElementsArray
@Test 
void testMultmatrizeWithMultipleElementsArray() throws IOException {
 assertEquals(6, AvaliaMultMatrizes.multmatrize(3, new int[]{1, 2, 3}));
}


}