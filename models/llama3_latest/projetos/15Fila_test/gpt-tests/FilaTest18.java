package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest18{


    @Test
    public void testEnfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        assertEquals(1, fila.desenfileira());
        assertEquals(2, fila.desenfileira());
        assertEquals(3, fila.desenfileira());
    }

    @Test(expected = Exception.class)
    public void testEnfileiraFilaCheia() throws Exception {
        Fila fila = new Fila();
        for (int i = 0; i < 1000; i++) {
            fila.enfileira(i);
        }
        fila.enfileira(1001);
    }

    @Test
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        assertEquals(1, fila.desenfileira());
        assertEquals(2, fila.desenfileira());
        assertEquals(3, fila.desenfileira());
    }

    @Test(expected = Exception.class)
    public void testDesenfileiraFilaVazia() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
    }

    @Test
    public void testVazia() {
        Fila fila = new Fila();
        assertTrue(fila.vazia());
        fila.enfileira(1);
        assertFalse(fila.vazia());
    }
}