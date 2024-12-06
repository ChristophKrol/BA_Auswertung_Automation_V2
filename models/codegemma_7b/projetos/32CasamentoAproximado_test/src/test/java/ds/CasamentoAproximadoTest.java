package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasamentoAproximadoTest{

/*
// Test Method: testShiftAndAproximadoWithEmptyText
@Test
void testShiftAndAproximadoWithEmptyText() throws Exception {
 assertThrows(Exception.class


// Test Method: testShiftAndAproximadoWithEmptyPattern
@Test
void testShiftAndAproximadoWithEmptyPattern() throws Exception {
 assertThrows(Exception.class


// Test Method: testShiftAndAproximadoWithInvalidKValue
@Test
void testShiftAndAproximadoWithInvalidKValue() throws Exception {
 assertThrows(Exception.class


// Test Method: testShiftAndAproximadoWithSingleCharacterTextAndPattern
@Test
void testShiftAndAproximadoWithSingleCharacterTextAndPattern() throws Exception {
 CasamentoAproximado.shiftAndAproximado("a"

*/
// Test Method: testShiftAndAproximadoWithMultipleCharactersTextAndPattern
@Test
void testShiftAndAproximadoWithMultipleCharactersTextAndPattern() throws Exception {
 CasamentoAproximado.shiftAndAproximado("ab", 2, "ab", 2, 0);
}


// Test Method: testShiftAndAproximadoWithTextAndPatternWithDifferentLengths
@Test
void testShiftAndAproximadoWithTextAndPatternWithDifferentLengths() throws Exception {
 CasamentoAproximado.shiftAndAproximado("abc", 3, "ab", 2, 0);
}


// Test Method: testShiftAndAproximadoWithTextAndPatternWithDifferentCase
@Test
void testShiftAndAproximadoWithTextAndPatternWithDifferentCase() throws Exception {
 CasamentoAproximado.shiftAndAproximado("Ab", 2, "aB", 2, 0);
}


// Test Method: testShiftAndAproximadoWithTextAndPatternWithSpecialCharacters
@Test
void testShiftAndAproximadoWithTextAndPatternWithSpecialCharacters() throws Exception {
 CasamentoAproximado.shiftAndAproximado("a!b", 3, "a!b", 3, 0);
}


// Test Method: testShiftAndAproximadoWithTextAndPatternWithBoundaryConditions
@Test
void testShiftAndAproximadoWithTextAndPatternWithBoundaryConditions() throws Exception {
 CasamentoAproximado.shiftAndAproximado("a", 1, "a", 1, 0);
}


}