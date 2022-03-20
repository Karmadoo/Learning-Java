package learning;

public class Fibonacchi {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursion(6));
        System.out.println(fibonacciIterable(6));
    }

    static int fibonacciRecursion(int x) {
        if (x <= 1) {
            return 1;
        }
        return fibonacciRecursion(x - 1) + fibonacciRecursion(x - 2);

    }

    static int fibonacciIterable(int x) {
        int[] arr = new int[x + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= x; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[x];
    }
}
