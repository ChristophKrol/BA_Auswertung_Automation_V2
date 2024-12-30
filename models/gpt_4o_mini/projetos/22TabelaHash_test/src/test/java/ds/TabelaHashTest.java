package ds;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import static org.junit.jupiter.api.Assertions.*;

class TabelaHashTest{

/*
// Test Method: testConstrutor
@Test
public void testConstrutor() {
    TabelaHash tabela = new TabelaHash();
    assertNotNull(tabela);
}!
*/
/*
// Test Method: testInsereEConsulta
@Test
public void testInsereEConsulta() {
    TabelaHash tabela = new TabelaHash();
    MyItem item = new MyItem(1);
    String chave = "chave1";
    tabela.insere(chave, item);
    Object retrieved = tabela.pesquisa(chave);
    assertEquals(item, retrieved);
}!


// Test Method: testInsereRegistroJaPresente
@Test
public void testInsereRegistroJaPresente() {
    TabelaHash tabela = new TabelaHash();
    MyItem item1 = new MyItem(1);
    MyItem item2 = new MyItem(2);
    String chave = "chave1";
    tabela.insere(chave, item1);
    tabela.insere(chave, item2); // deve simplesmente passar
    Object retrieved = tabela.pesquisa(chave);
    assertEquals(item1, retrieved);
}!


// Test Method: testRetiraComSucesso
@Test
public void testRetiraComSucesso() throws Exception {
    TabelaHash tabela = new TabelaHash();
    MyItem item = new MyItem(1);
    String chave = "chave1";
    tabela.insere(chave, item);
    tabela.retira(chave);
    assertNull(tabela.pesquisa(chave));
}!

*//*
// Test Method: testRetiraChaveInvalida
@Test
public void testRetiraChaveInvalida() throws Exception {
    TabelaHash tabela = new TabelaHash();
    assertThrows(Exception.class, () -> {
        tabela.retira(null);
    });
}!

*/
/*
// Test Method: testPesquisaComChaveNula
@Test
public void testPesquisaComChaveNula() {
    TabelaHash tabela = new TabelaHash();
    Object obj = tabela.pesquisa(null);
    assertNull(obj);
}!




// Test Method: testVaziaTrue
@Test
public void testVaziaTrue() {
    TabelaHash tabela = new TabelaHash();
    assertTrue(tabela.vazia);
}!
 */
/*
// Test Method: testImprime
@Test
public void testImprime() {
    TabelaHash tabela = new TabelaHash();
    MyItem item = new MyItem(1);
    String chave = "chave1";
    tabela.insere(chave, item);
    OutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    tabela.imprime();
    assertTrue(outContent.toString().contains("Entrada: 1"));
}!


 */
/*
// Test Method: testPesquisanChaveInexistente
@Test
public void testPesquisanChaveInexistente() {
    TabelaHash tabela = new TabelaHash();
    Object obj = tabela.pesquisa("chaveInexistente");
    assertNull(obj);
}!




// Test Method: testInsereComChaveInvalida
@Test
public void testInsereComChaveInvalida() {
    TabelaHash tabela = new TabelaHash();
    assertThrows(Exception.class, () -> {
        tabela.insere(null, new MyItem(1));
    });
}!
*/

}