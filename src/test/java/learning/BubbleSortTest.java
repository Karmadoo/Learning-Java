package learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void test() {
        int[] arr = {8, 4, 1, 6, 4, 2};
        BubbleSort.sort(arr);
        int[] expected = {1, 2, 4, 4, 6, 8};
        Assertions.assertArrayEquals(expected, arr);
    }

}
