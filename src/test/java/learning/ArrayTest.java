package learning;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testNumberOfElements(){
        int[] arr = {10, 15, 20, 2, 5, 1, 10, 2};
        int number = numberOfElements.numberOfElement(arr);
        assertEquals( 5, number);
    }

    @Test
    public void testAverage(){
        int[] arr = {10, 15, 20, 2, 5, 1, 10, 2};
        int average = numberOfElements.average(arr);
        int result = Arrays.stream(arr).sum() / arr.length;
        assertEquals(average, result);
    }

    @Test
    public void testPalindrome(){
        int[] arr = {10, 15, 20, 2, 5, 1, 10, 2};
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 3, 2, 1};
        boolean result = numberOfElements.palindrome(arr);
        boolean result1 = numberOfElements.palindrome(arr1);
        boolean result2 = numberOfElements.palindrome(arr2);
        assertFalse(result);
        assertTrue(result1);
        assertTrue(result2);
    }

}
