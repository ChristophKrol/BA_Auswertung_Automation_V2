import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasamentoAproximadoTest{


// Test Method: testShiftAndAproximado_ValidInput_ReturnsExpectedResult
@Test
public void testShiftAndAproximado_ValidInput_ReturnsExpectedResult() {
    String T = "ababcabc";
    String P = "abc";
    int k = 1;
    int expectedPosition = 5; // Expected position of the pattern
    // Redirect System.out to capture printed output
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    String output = outContent.toString();
    assertTrue(output.contains("Casamento na posicao: c")); // Check for the presence of expected output
}


// Test Method: testShiftAndAproximado_NoMatches_ReturnsNoOutput
@Test
public void testShiftAndAproximado_NoMatches_ReturnsNoOutput() {
    String T = "xyz";
    String P = "abc";
    int k = 1;
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    String output = outContent.toString();
    assertEquals("
", output); // No match should result in no output
}


// Test Method: testShiftAndAproximado_EmptyText_ReturnsNoOutput
@Test
public void testShiftAndAproximado_EmptyText_ReturnsNoOutput() {
    String T = "";
    String P = "abc";
    int k = 1;
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    String output = outContent.toString();
    assertEquals("
", output); // No output expected for empty text
}


// Test Method: testShiftAndAproximado_ExactMatch_ReturnsMatch
@Test
public void testShiftAndAproximado_ExactMatch_ReturnsMatch() {
    String T = "abcabcabc";
    String P = "abc";
    int k = 0;
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    String output = outContent.toString();
    assertTrue(output.contains("Casamento na posicao: c")); // First occurrence
}


// Test Method: testShiftAndAproximado_KGreaterThanM_ReturnsAllMatches
@Test
public void testShiftAndAproximado_KGreaterThanM_ReturnsAllMatches() {
    String T = "abababab";
    String P = "ab";
    int k = 2;
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    String output = outContent.toString();
    assertTrue(output.contains("Casamento na posicao: b")); // Check for matches with k>m
}


// Test Method: testShiftAndAproximado_NegativeK_ThrowsException
@Test
public void testShiftAndAproximado_NegativeK_ThrowsException() {
    String T = "abc";
    String P = "ab";
    int k = -1;
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        CasamentoAproximado.shiftAndAproximado(T, T.length(), P, P.length(), k);
    });
    String expectedMessage = "k must be non-negative";
    String actualMessage = exception.getMessage();
    assertTrue(actualMessage.contains(expectedMessage));
}


}