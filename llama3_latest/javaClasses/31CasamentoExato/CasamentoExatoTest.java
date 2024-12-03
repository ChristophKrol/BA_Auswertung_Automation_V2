import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasamentoExatoTest{


// Test Method: testForcaBrutaEmptyArray
@Test
void testForcaBrutaEmptyArray(){
    String T = "";
    int n = 0;
    String P = "";
    int m = 0;
    CasamentoExato.forcaBruta(T, n, P, m);
}



// Test Method: testForcaBrutaOneElementArray
@Test
void testForcaBrutaOneElementArray(){
    String T = "a";
    int n = 1;
    String P = "a";
    int m = 1;
    CasamentoExato.forcaBruta(T, n, P, m);
}



// Test Method: testForcaBrutaMultipleElementsArray
@Test
void testForcaBrutaMultipleElementsArray(){
    String T = "abc";
    int n = 3;
    String P = "ab";
    int m = 2;
    CasamentoExato.forcaBruta(T, n, P, m);
}



// Test Method: testShiftAndExatoEmptyArray
@Test
void testShiftAndExatoEmptyArray(){
    String T = "";
    int n = 0;
    String P = "";
    int m = 0;
    CasamentoExato.shiftAndExato(T, n, P, m);
}



// Test Method: testShiftAndExatoOneElementArray
@Test
void testShiftAndExatoOneElementArray(){
    String T = "a";
    int n = 1;
    String P = "a";
    int m = 1;
    CasamentoExato.shiftAndExato(T, n, P, m);
}



// Test Method: testShiftAndExatoMultipleElementsArray
@Test
void testShiftAndExatoMultipleElementsArray(){
    String T = "abc";
    int n = 3;
    String P = "ab";
    int m = 2;
    CasamentoExato.shiftAndExato(T, n, P, m);
}



// Test Method: testBmhEmptyArray
@Test
void testBmhEmptyArray(){
    String T = "";
    int n = 0;
    String P = "";
    int m = 0;
    CasamentoExato.bmhs(T, n, P, m);
}



// Test Method: testBmhOneElementArray
@Test
void testBmhOneElementArray(){
    String T = "a";
    int n = 1;
    String P = "a";
    int m = 1;
    CasamentoExato.bmhs(T, n, P, m);
}



// Test Method: testBmhMultipleElementsArray
@Test
void testBmhMultipleElementsArray(){
    String T = "abc";
    int n = 3;
    String P = "ab";
    int m = 2;
    CasamentoExato.bmhs(T, n, P, m);
}



// Test Method: testBmhsEmptyArray
@Test
void testBmhsEmptyArray(){
    String T = "";
    int n = 0;
    String P = "";
    int m = 0;
    CasamentoExato.bmh(T, n, P, m);
}



// Test Method: testBmhsOneElementArray
@Test
void testBmhsOneElementArray(){
    String T = "a";
    int n = 1;
    String P = "a";
    int m = 1;
    CasamentoExato.bmh(T, n, P, m);
}



// Test Method: testBmhsMultipleElementsArray
@Test
void testBmhsMultipleElementsArray(){
    String T = "abc";
    int n = 3;
    String P = "ab";
    int m = 2;
    CasamentoExato.bmh(T, n, P, m);
}



}