import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasamentoExatoTest{


// Test Method: forcaBrutaTest
@Test 
void forcaBrutaTest(){
 assertEquals(expected, CasamentoExato.forcaBruta(T, n, P, m));
}


// Test Method: shiftAndExatoTest
@Test 
void shiftAndExatoTest(){
 assertEquals(expected, CasamentoExato.shiftAndExato(T, n, P, m));
}


// Test Method: bmhTest
@Test 
void bmhTest(){
 assertEquals(expected, CasamentoExato.bmh(T, n, P, m));
}


// Test Method: bmhsTest
@Test 
void bmhsTest(){
 assertEquals(expected, CasamentoExato.bmhs(T, n, P, m));
}


}