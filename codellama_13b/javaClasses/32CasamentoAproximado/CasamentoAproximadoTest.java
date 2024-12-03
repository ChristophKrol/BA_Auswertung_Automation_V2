import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasamentoAproximadoTest{


// Test Method: testShiftAndAproximadoWithEmptyString
@Test 
void testShiftAndAproximadoWithEmptyString(){
 assertEquals(0, CasamentoAproximado.shiftAndAproximado("", 0, "", 0, 1));
}


// Test Method: testShiftAndAproximadoWithOneCharacterPattern
@Test 
void testShiftAndAproximadoWithOneCharacterPattern(){
 assertEquals(1, CasamentoAproximado.shiftAndAproximado("abcd", 4, "a", 1, 1));
}


// Test Method: testShiftAndAproximadoWithMultipleCharacterPattern
@Test 
void testShiftAndAproximadoWithMultipleCharacterPattern(){
 assertEquals(2, CasamentoAproximado.shiftAndAproximado("abcd", 4, "ab", 2, 1));
}


// Test Method: testShiftAndAproximadoWithLargePattern
@Test 
void testShiftAndAproximadoWithLargePattern(){
 assertEquals(3, CasamentoAproximado.shiftAndAproximado("abcd", 4, "abcdefghijklmnopqrstuvwxyz", 26, 1));
}


// Test Method: testShiftAndAproximadoWithLargeText
@Test 
void testShiftAndAproximadoWithLargeText(){
 assertEquals(4, CasamentoAproximado.shiftAndAproximado("abcdefghijklmnopqrstuvwxyz", 26, "abcd", 4, 1));
}


}