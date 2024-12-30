package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenacaoTest{


// Test Method: testOrdensAscendente
@Test
void testOrdensAscendente() {
    int[] v = {5, 3, 8, 6};
    int n = v.length;
    Ordenacao.ordena(v, n);
    assertArrayEquals(new int[]{3, 5, 6, 8}, v);
}


// Test Method: testOrdensDescendente
@Test
void testOrdensDescendente() {
    int[] v = {8, 6, 5, 3};
    int n = v.length;
    Ordenacao.ordena(v, n);
    assertArrayEquals(new int[]{3, 5, 6, 8}, v);
}


// Test Method: testOrdensRepetido
@Test
void testOrdensRepetido() {
    int[] v = {3, 3, 2, 1};
    int n = v.length;
    Ordenacao.ordena(v, n);
    assertArrayEquals(new int[]{1, 2, 3, 3}, v);
}


// Test Method: testOrdensVazia
@Test
void testOrdensVazia() {
    int[] v = {};
    int n = v.length;
    Ordenacao.ordena(v, n);
    assertArrayEquals(new int[]{}, v);
}


// Test Method: testOrdensUmElemento
@Test
void testOrdensUmElemento() {
    int[] v = {42};
    int n = v.length;
    Ordenacao.ordena(v, n);
    assertArrayEquals(new int[]{42}, v);
}


// Test Method: testOrdensNegativos
@Test
void testOrdensNegativos() {
    int[] v = {5, -1, 0, -10};
    int n = v.length;
    Ordenacao.ordena(v, n);
    assertArrayEquals(new int[]{-10, -1, 0, 5}, v);
}


// Test Method: testOrdensMisturados
@Test
void testOrdensMisturados() {
    int[] v = {0, -5, 3, -2, 8};
    int n = v.length;
    Ordenacao.ordena(v, n);
    assertArrayEquals(new int[]{-5, -2, 0, 3, 8}, v);
}


}