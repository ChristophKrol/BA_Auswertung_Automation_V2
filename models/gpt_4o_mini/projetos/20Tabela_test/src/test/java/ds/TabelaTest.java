package ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabelaTest{

/*
// Test Method: testPesquisa
@Test
public void testPesquisa() throws Exception {
    Tabela tabela = new Tabela();
    MeuItem item1 = new MeuItem(1);
    MeuItem item2 = new MeuItem(2);
    MeuItem item3 = new MeuItem(3);
    tabela.insere(item1);
    tabela.insere(item2);
    tabela.insere(item3);
    assertEquals(1, tabela.pesquisa(item2)); // Testando busca pelo item existente
    assertEquals(0, tabela.pesquisa(new MeuItem(4))); // Testando busca por item inexistente
}

 */


// Test Method: testInsere
@Test
public void testInsere() throws Exception {
    Tabela tabela = new Tabela();
    for (int i = 1; i <= 10; i++) {
        tabela.insere(new MeuItem(i));
    }
    Exception exception = assertThrows(Exception.class, () -> {
        tabela.insere(new MeuItem(11)); // Tentativa de inserir item quando a tabela est? cheia
    });
    assertEquals("Erro: A tabela esta cheia", exception.getMessage());
}

/*
// Test Method: testBinaria
@Test
public void testBinaria() throws Exception {
    Tabela tabela = new Tabela();
    MeuItem[] items = {new MeuItem(1), new MeuItem(3), new MeuItem(5), new MeuItem(7)};
    for (MeuItem item : items) {
        tabela.insere(item);
    }
    assertEquals(1, tabela.binaria(new MeuItem(3))); // Teste com item que existe
    assertEquals(0, tabela.binaria(new MeuItem(2))); // Teste com item que n?o existe
    assertEquals(0, tabela.binaria(new MeuItem(11))); // Teste com item maior que todos
}


 */

}