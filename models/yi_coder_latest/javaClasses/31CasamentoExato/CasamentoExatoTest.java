import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasamentoExatoTest{


// Test Method: testForcaBrutaWithEmptyTextAndPattern
@Test 
void testForcaBrutaWithEmptyTextAndPattern() { 
String T = "";
 String P = "";
 CasamentoExato.forcaBruta(T, T.length(), P, P.length());
 }


// Test Method: testForcaBrutaWithNonEmptyTextAndEmptyPattern
@Test 
void testForcaBrutaWithNonEmptyTextAndEmptyPattern() { 
String T = "abc";
 String P = "";
 CasamentoExato.forcaBruta(T, T.length(), P, P.length());
 }


// Test Method: testForcaBrutaWithNonEmptyTextAndPattern
@Test 
void testForcaBrutaWithNonEmptyTextAndPattern() { 
String T = "abc";
 String P = "abc";
 CasamentoExato.forcaBruta(T, T.length(), P, P.length());
 }


// Test Method: testShiftAndExatoWithEmptyTextAndPattern
@Test 
void testShiftAndExatoWithEmptyTextAndPattern() { 
String T = "";
 String P = "";
 CasamentoExato.shiftAndExato(T, T.length(), P, P.length());
 }


// Test Method: testShiftAndExatoWithNonEmptyTextAndEmptyPattern
@Test 
void testShiftAndExatoWithNonEmptyTextAndEmptyPattern() { 
String T = "abc";
 String P = "";
 CasamentoExato.shiftAndExato(T, T.length(), P, P.length());
 }


// Test Method: testShiftAndExatoWithNonEmptyTextAndPattern
@Test 
void testShiftAndExatoWithNonEmptyTextAndPattern() { 
String T = "abc";
 String P = "abc";
 CasamentoExato.shiftAndExato(T, T.length(), P, P.length());
 }


// Test Method: testBmhWithEmptyTextAndPattern
@Test 
void testBmhWithEmptyTextAndPattern() { 
String T = "";
 String P = "";
 CasamentoExato.bmh(T, T.length(), P, P.length());
 }


// Test Method: testBmhWithNonEmptyTextAndEmptyPattern
@Test 
void testBmhWithNonEmptyTextAndEmptyPattern() { 
String T = "abc";
 String P = "";
 CasamentoExato.bmh(T, T.length(), P, P.length());
 }


// Test Method: testBmhWithNonEmptyTextAndPattern
@Test 
void testBmhWithNonEmptyTextAndPattern() { 
String T = "abc";
 String P = "abc";
 CasamentoExato.bmh(T, T.length(), P, P.length());
 }


// Test Method: testBmhsWithEmptyTextAndPattern
@Test 
void testBmhsWithEmptyTextAndPattern() { 
String T = "";
 String P = "";
 CasamentoExato.bmhs(T, T.length(), P, P.length());
 }


// Test Method: testBmhsWithNonEmptyTextAndEmptyPattern
@Test 
void testBmhsWithNonEmptyTextAndEmptyPattern() { 
String T = "abc";
 String P = "";
 CasamentoExato.bmhs(T, T.length(), P, P.length());
 }


// Test Method: testBmhsWithNonEmptyTextAndPattern
@Test 
void testBmhsWithNonEmptyTextAndPattern() { 
String T = "abc";
 String P = "abc";
 CasamentoExato.bmhs(T, T.length(), P, P.length());
 }


}