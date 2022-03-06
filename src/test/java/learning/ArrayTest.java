package learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {

    @Test
    public void testFindMax() {
        int[] arr = {-1, -2, -3, -8};
        int result = Array2Examples.findMax(arr);
        assertEquals(8, result);
    }

    @Test
    public void testFindMaxInEmptyArray() {
        int[] arr = {};
        int result = Array2Examples.findMax(arr);
        assertEquals(0, result);
    }

    @Test
    public void testEratosfen() {
        boolean[] eratosfen = Array2Examples.getEratosfen(12);
    }

}
