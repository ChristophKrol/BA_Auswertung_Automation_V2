package ds;

import ds.TabelaHash;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabelaHashTest{


// Test Method: testInserirElementoComChaveUnica
@Test
void testInserirElementoComChaveUnica() {
    TabelaHash tabela = new TabelaHash();
    MeuItem meuItem = new MeuItem(1);
    tabela.insere("chave1", meuItem);
    assertEquals(meuItem, tabela.pesquisa("chave1"));
}


// Test Method: testInserirElementoComChaveDuplicada
@Test
void testInserirElementoComChaveDuplicada() {
    TabelaHash tabela = new TabelaHash();
    MeuItem meuItem1 = new MeuItem(1);
    MeuItem meuItem2 = new MeuItem(2);
    tabela.insere("chave1", meuItem1);
    tabela.insere("chave1", meuItem2); // Tentativa de inserir chave duplicada
    assertEquals(meuItem1, tabela.pesquisa("chave1")); // deve permanecer o primeiro
}


// Test Method: testRemoverElementoPresente
@Test
void testRemoverElementoPresente() throws Exception {
    TabelaHash tabela = new TabelaHash();
    MeuItem meuItem = new MeuItem(1);
    tabela.insere("chave1", meuItem);
    tabela.retira("chave1");
    assertNull(tabela.pesquisa("chave1"));
}

/*
// Test Method: testRemoverElementoNaoPresente
@Test
void testRemoverElementoNaoPresente() throws Exception {
    TabelaHash tabela = new TabelaHash();
    try {
        tabela.retira("chaveNaoPresente"); // deve lan?ar uma exce??o
        fail("Deveria jogar uma exce??o");
    } catch (Exception e) {
        assertEquals("Registro nao esta presente", e.getMessage());
    }
}


 */

// Test Method: testRecuperaItensComEspacosVazios
@Test
void testRecuperaItensComEspacosVazios() throws Exception {
    TabelaHash tabela = new TabelaHash();
    MeuItem meuItem1 = new MeuItem(1);
    MeuItem meuItem2 = new MeuItem(2);
    tabela.insere("chave1", meuItem1);
    tabela.insere("chave2", meuItem2);
    tabela.retira("chave1");
    Object[] itens = tabela.recuperaItens();
    assertEquals(1, itens.length);
    assertEquals(meuItem2, itens[0]);
}


// Test Method: testInserirNaTabelaCheia
@Test
void testInserirNaTabelaCheia() {
    TabelaHash tabela = new TabelaHash();
    // Preencher a tabela at? o limite
    for (int i = 0; i < 7; i++) {
        tabela.insere("chave" + i, new MeuItem(i));
    }
    // Tentar inserir na tabela cheia
    tabela.insere("chave8", new MeuItem(8)); // Deve imprimir "Tabela cheia"
    assertNull(tabela.pesquisa("chave8"));
}

/*
// Test Method: testPesquisandoElementoNaoExistente
@Test
void testPesquisandoElementoNaoExistente() {
    TabelaHash tabela = new TabelaHash();
    assertNull(tabela.pesquisa("chaveInexistente"));
}

 */


// Test Method: testRemoverComKeyNull
@Test
void testRemoverComKeyNull() throws Exception {
    TabelaHash tabela = new TabelaHash();
    try {
        tabela.retira(null);
        fail("Deveria lan?ar exce??o");
    } catch (Exception e) {
        assertNotNull(e);
    }
}


// Test Method: testImprimeTabela
@Test
void testImprimeTabela() {
    TabelaHash tabela = new TabelaHash();
    MeuItem meuItem1 = new MeuItem(1);
    MeuItem meuItem2 = new MeuItem(2);
    tabela.insere("chave1", meuItem1);
    tabela.insere("chave2", meuItem2);
    // M?todo imprime n?o retorna nada, mas podemos verificar se a impress?o ocorre sem exce??es.
    assertDoesNotThrow(() -> tabela.imprime());
}


}