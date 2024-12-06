package ds;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest{


// Test Method: testInsereAndVaziaWithEmptyList
@Test 
void testInsereAndVaziaWithEmptyList() { 
 Lista list = new Lista(); 
 assertTrue(list.vazia()); 
 list.insere("test"); 
 assertFalse(list.vazia()); 
}

/*
// Test Method: testInsereAndImprimeWithOneElementList
@Test 
void testInsereAndImprimeWithOneElementList() { 
StringWriter stringWriter = new StringWriter(); System.setOut(new PrintStream(stringWriter));
Lista list = new Lista(); 
list.insere("test"); 
list.imprime(); 
assertEquals("test", stringWriter.toString());
System.setOut(System.out); 
}


// Test Method: testInsereAndImprimeWithMultipleElementsList
@Test 
void testInsereAndImprimeWithMultipleElementsList() { 
StringWriter stringWriter = new StringWriter(); System.setOut(new PrintStream(stringWriter)); 
Lista list = new Lista(); 
list.insere("test1"); 
list.insere("test2"); 
list.imprime(); 
assertEquals("test1 test2", stringWriter.toString());
System.setOut(System.out); 
}
*/

}