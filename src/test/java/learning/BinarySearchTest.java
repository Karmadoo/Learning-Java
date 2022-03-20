package learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchTest {

    @Test
    public void test() {
        int[] sortedArray = {1, 3, 4, 5, 6, 7, 8, 9};
        assertTrue(BinarySearch.search(sortedArray, 3));
        assertFalse(BinarySearch.search(sortedArray, 2));
    }


}
