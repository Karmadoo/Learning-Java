package learning;

import java.util.Arrays;

public class BoubleSort {
    public static void main(String[] args) {
        int[] unsorted = {10, 15, 2, 8, 96, 25, 8, 999};
        BubbleSort(unsorted);
    }

    static void BubbleSort(int[] arr) {

        boolean counter = false;
        while (!counter) {
            counter = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    counter = false;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
