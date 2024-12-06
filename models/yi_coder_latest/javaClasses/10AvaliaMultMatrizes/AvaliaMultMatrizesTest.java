import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvaliaMultMatrizesTest{


// Test Method: testMultmatrizeWithNullArray
@Test(expected = NullPointerException.class) 
void testMultmatrizeWithNullArray() throws IOException { AvaliaMultMatrizes.multmatrize(null); }


// Test Method: testMultmatrizeWithEmptyArray
@Test 
void testMultmatrizeWithEmptyArray() throws IOException { AvaliaMultMatrizes.multmatrize(new int[0]); }


// Test Method: testMultmatrizeWithOneElementArray
@Test 
void testMultmatrizeWithOneElementArray() throws IOException { AvaliaMultMatrizes.multmatrize(new int[]{1}); }


// Test Method: testMultmatrizeWithMultipleElementsArray
@Test 
void testMultmatrizeWithMultipleElementsArray() throws IOException { AvaliaMultMatrizes.multmatrize(new int[]{1, 2, 3}); }


}