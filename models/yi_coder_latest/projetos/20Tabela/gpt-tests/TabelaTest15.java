package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaTest15{


    @Test
    public void testPesquisa() {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        tabela.insere(item1);
        tabela.insere(item2);
        tabela.insere(item3);

        assertEquals(1, tabela.pesquisa(item1));
        assertEquals(2, tabela.pesquisa(item2));
        assertEquals(3, tabela.pesquisa(item3));
    }

    @Test
    public void testInsere() {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        try {
            tabela.insere(item1);
            tabela.insere(item2);
            tabela.insere(item3);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }

        assertEquals(3, tabela.n);
        assertEquals(item1, tabela.registros[1]);
        assertEquals(item2, tabela.registros[2]);
        assertEquals(item3, tabela.registros[3]);
    }

    @Test(expected = Exception.class)
    public void testInsereWhenTabelaIsFull() throws Exception {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        tabela.insere(item1);
        tabela.insere(item2);
        tabela.insere(item3);
        tabela.insere(new MeuItem(4)); // Should throw an exception
    }

    @Test
    public void testBinaria() {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        tabela.insere(item1);
        tabela.insere(item2);
        tabela.insere(item3);

        assertEquals(1, tabela.binaria(item1));
        assertEquals(2, tabela.binaria(item2));
        assertEquals(3, tabela.binaria(item3));
    }

    @Test
    public void testBinariaWhenItemNotInTabela() {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        tabela.insere(item1);
        tabela.insere(item2);
        tabela.insere(item3);

        Item item4 = new MeuItem(4);
        assertEquals(0, tabela.binaria(item4));
    }

}