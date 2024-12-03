import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenacaoTest{


// Test Method: testMergeWithEmptyArrays
@Test 
void testMergeWithEmptyArrays(){
 assertNull(Ordenacao.merge(new int[0], 0, 0));
}


// Test Method: testMergeWithOneElementArrays
@Test 
void testMergeWithOneElementArrays(){
 assertEquals(1, Ordenacao.merge(new int[]{1}, 0, 1));
}


// Test Method: testMergeWithMultipleElementsArrays
@Test 
void testMergeWithMultipleElementsArrays(){
 assertEquals(3, Ordenacao.merge(new int[]{1, 2, 3}, 0, 2));
}


}