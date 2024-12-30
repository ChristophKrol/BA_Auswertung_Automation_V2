package ds;import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public class OrdenacaoTest16{


    @Test
    public void testSelecao() {
        MeuItem[] v = new MeuItem[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(2);

        Ordenacao.selecao(v, 5);

        Assert.assertEquals(1, v[0].recuperaChave());
        Assert.assertEquals(2, v[1].recuperaChave());
        Assert.assertEquals(3, v[2].recuperaChave());
        Assert.assertEquals(4, v[3].recuperaChave());
        Assert.assertEquals(5, v[4].recuperaChave());
    }

    @Test
    public void testInsercao() {
        MeuItem[] v = new MeuItem[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(2);

        Ordenacao.insercao(v, 5);

        Assert.assertEquals(1, v[0].recuperaChave());
        Assert.assertEquals(2, v[1].recuperaChave());
        Assert.assertEquals(3, v[2].recuperaChave());
        Assert.assertEquals(4, v[3].recuperaChave());
        Assert.assertEquals(5, v[4].recuperaChave());
    }

    @Test
    public void testShellsort() {
        MeuItem[] v = new MeuItem[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(2);

        Ordenacao.shellsort(v, 5);

        Assert.assertEquals(1, v[0].recuperaChave());
        Assert.assertEquals(2, v[1].recuperaChave());
        Assert.assertEquals(3, v[2].recuperaChave());
        Assert.assertEquals(4, v[3].recuperaChave());
        Assert.assertEquals(5, v[4].recuperaChave());
    }

    @Test
    public void testQuicksort() {
        MeuItem[] v = new MeuItem[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(2);

        Ordenacao.quicksort(v, 5);

        Assert.assertEquals(1, v[0].recuperaChave());
        Assert.assertEquals(2, v[1].recuperaChave());
        Assert.assertEquals(3, v[2].recuperaChave());
        Assert.assertEquals(4, v[3].recuperaChave());
        Assert.assertEquals(5, v[4].recuperaChave());
    }

    @Test
    public void testHeapsort() {
        MeuItem[] v = new MeuItem[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(2);

        Ordenacao.heapsort(v, 5);

        Assert.assertEquals(1, v[0].recuperaChave());
        Assert.assertEquals(2, v[1].recuperaChave());
        Assert.assertEquals(3, v[2].recuperaChave());
        Assert.assertEquals(4, v[3].recuperaChave());
        Assert.assertEquals(5, v[4].recuperaChave());
    }
}