package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest22{


    @Test
    public void testMergeSort() {
        int[] input = {5, 2, 9, 1, 7};
        int[] expectedOutput = {1, 2, 5, 7, 9};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testMergeSortWithEmptyArray() {
        int[] input = {};
        int[] expectedOutput = {};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testMergeSortWithSingleElement() {
        int[] input = {3};
        int[] expectedOutput = {3};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testMergeSortWithAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expectedOutput = {1, 2, 3, 4, 5};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testMergeSortWithReverseSortedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expectedOutput = {1, 2, 3, 4, 5};
        Ordenacao.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expectedOutput, input);
    }
}