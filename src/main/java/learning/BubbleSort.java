package learning;

public class BubbleSort {

    //отношение сравнения между любыми парами элементов: < >
    //транзитивность: a < b, b < c   ->   a < c

    //8 4 1 6 4 2
    //4 1 6 4 2 8
    //1 4 4 6 2 8
    //1 4 4 2 6 8
    //1 4 2 4 6 8
    //1 2 4 4 6 8
    //1 2 4 4 6 8 <- result

    //8 4' 1 6 4'' 2
    //1 2 4' 4'' 6 8
    //1 2 4'' 4' 6 8

    //f(x) = O(g(x)) <-> x -> +inf => f(x) / g(x) -> C != 0
    //O(1) = const, O(ln N), O(N), O(N * ln N), O(N^2)

    //memory: O(N + 4) = O(N)
    //complexity: O(N * N/2) = O(N^2)
    //stability: true
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
