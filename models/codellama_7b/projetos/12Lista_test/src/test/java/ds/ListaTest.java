package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest{


// Test Method: testVaziaInicialmente
@Test 
void testVaziaInicialmente(){
 assertTrue(new Lista().vazia());
}


// Test Method: testInsereUmElemento
@Test 
void testInsereUmElemento(){
 Lista lista = new Lista(); Object item = new Object(); lista.insere(item); assertFalse(lista.vazia());
}


// Test Method: testImprimeListaVazia
@Test 
void testImprimeListaVazia(){
 Lista lista = new Lista(); lista.imprime();
}


// Test Method: testImprimeListaComUmElemento
@Test 
void testImprimeListaComUmElemento(){
 Lista lista = new Lista(); Object item = new Object(); lista.insere(item); lista.imprime();
}


// Test Method: testImprimeListaComVariosElementos
@Test 
void testImprimeListaComVariosElementos(){
 Lista lista = new Lista(); Object item1 = new Object(); Object item2 = new Object(); Object item3 = new Object(); lista.insere(item1); lista.insere(item2); lista.insere(item3); lista.imprime();
}


}