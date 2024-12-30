package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasamentoExatoTest{


// Test Method: testForcaBruta_whenPatternFound_shouldPrintPosition
@Test
public void testForcaBruta_whenPatternFound_shouldPrintPosition() {
    // Arrange
    String T = "ababcabcacbab";
    String P = "abc";
    int n = T.length();
    int m = P.length();
    
    // Act
    CasamentoExato.forcaBruta(T, n, P, m);
    
    // Assert
    // Check the console output for the expected result
}


// Test Method: testForcaBruta_whenPatternNotFound_shouldNotPrintPosition
@Test
public void testForcaBruta_whenPatternNotFound_shouldNotPrintPosition() {
    // Arrange
    String T = "abcdefgh";
    String P = "xyz";
    int n = T.length();
    int m = P.length();
    
    // Act
    CasamentoExato.forcaBruta(T, n, P, m);
    
    // Assert
    // Check the console output for the expected result
}


// Test Method: testShiftAndExato_whenPatternFound_shouldPrintPosition
@Test
public void testShiftAndExato_whenPatternFound_shouldPrintPosition() {
    // Arrange
    String T = "ababcabcacbab";
    String P = "abc";
    int n = T.length();
    int m = P.length();
    
    // Act
    CasamentoExato.shiftAndExato(T, n, P, m);
    
    // Assert
    // Check the console output for the expected result
}


// Test Method: testShiftAndExato_whenPatternNotFound_shouldNotPrintPosition
@Test
public void testShiftAndExato_whenPatternNotFound_shouldNotPrintPosition() {
    // Arrange
    String T = "abcdefgh";
    String P = "xyz";
    int n = T.length();
    int m = P.length();
    
    // Act
    CasamentoExato.shiftAndExato(T, n, P, m);
    
    // Assert
    // Check the console output for the expected result
}


// Test Method: testBmh_whenPatternFound_shouldPrintPosition
@Test
public void testBmh_whenPatternFound_shouldPrintPosition() {
    // Arrange
    String T = "ababcabcacbab";
    String P = "abc";
    int n = T.length();
    int m = P.length();
    
    // Act
    CasamentoExato.bmh(T, n, P, m);
    
    // Assert
    // Check the console output for the expected result
}


// Test Method: testBmh_whenPatternNotFound_shouldNotPrintPosition
@Test
public void testBmh_whenPatternNotFound_shouldNotPrintPosition() {
    // Arrange
    String T = "abcdefgh";
    String P = "xyz";
    int n = T.length();
    int m = P.length();
    
    // Act
    CasamentoExato.bmh(T, n, P, m);
    
    // Assert
    // Check the console output for the expected result
}


// Test Method: testBmhs_whenPatternFound_shouldPrintPosition
@Test
public void testBmhs_whenPatternFound_shouldPrintPosition() {
    // Arrange
    String T = "ababcabcacbab";
    String P = "abc";
    int n = T.length();
    int m = P.length();
    
    // Act
    CasamentoExato.bmhs(T, n, P, m);
    
    // Assert
    // Check the console output for the expected result
}


// Test Method: testBmhs_whenPatternNotFound_shouldNotPrintPosition
@Test
public void testBmhs_whenPatternNotFound_shouldNotPrintPosition() {
    // Arrange
    String T = "abcdefgh";
    String P = "xyz";
    int n = T.length();
    int m = P.length();
    
    // Act
    CasamentoExato.bmhs(T, n, P, m);
    
    // Assert
    // Check the console output for the expected result
}


}