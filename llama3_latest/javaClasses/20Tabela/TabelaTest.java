import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabelaTest{


// Test Method: testTabelaEmptyArray
@Test
void testTabelaEmptyArray(){
	Tabela tabela = new Tabela();
	assertNull(tabela.registros);
}



// Test Method: testTabelaOneElementArray
@Test
void testTabelaOneElementArray(){
	Tabela tabela = new Tabela();
	Item item = new MeuItem(1);
	tabela.insere(item);
	assertNotNull(tabela.registros[0]);
}



// Test Method: testTabelaMultipleElementsArray
@Test
void testTabelaMultipleElementsArray(){
	Tabela tabela = new Tabela();
	Item item1 = new MeuItem(1), item2 = new MeuItem(2), item3 = new MeuItem(3);
	tabela.insere(item1); tabela.insere(item2); tabela.insere(item3);
	assertNotNull(tabela.registros[0]); assertNotNull(tabela.registros[1]); assertNotNull(tabela.registros[2]);
}



// Test Method: testTabelaSearch
@Test
void testTabelaSearch(){
	Tabela tabela = new Tabela();
	Item item = new MeuItem(1);
	tabela.insere(item);
	assertNotNull(tabela.registros[0]);
}



// Test Method: testPermutacaoRandomica
@Test
void testPermutacaoRandomica(){
	PermutacaoRandomica permut = new PermutacaoRandomica();
	MeuItem[] v = new MeuItem[20];
	for (int i = 1; i <= 20; i++) v[i] = new MeuItem(i);
	permut.permut(v, 20);
	// assert some permutation happened
}



}