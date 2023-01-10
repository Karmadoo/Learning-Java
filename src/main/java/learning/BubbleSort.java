package learning;

public class BubbleSort {
    static void sort(int[] arr) {
        boolean hasSwap = true;

        while (hasSwap) {
            hasSwap = false;
            for (int i = 0; i < arr.length - 1; i++) {
                int current = arr[i];
                int next = arr[i + 1];
                if (next < current) { //stability
                    arr[i] = next;
                    arr[i + 1] = current;
                    hasSwap = true;
                }
            }
        }
    }

}
