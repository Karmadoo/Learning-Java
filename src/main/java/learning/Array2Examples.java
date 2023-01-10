package learning;

public class Array2Examples {

    //eratosfen
    //0 1 2 3 4 5 6 7 8 9 10 11 12
    //i = 2
    //0 1 2 3 x 5 x 7 x 9 x 11 x
    //i = 3
    //0 1 2 3 x 5 x 7 x x x 11 x
    //i * i <= max

    static boolean[] getEratosfen(int max) { 
        boolean[] result = new boolean[max + 1];
        for (int i = 2; i * i <= max; i++) {
            for (int j = i + 1; j <= max; j++) {
                if (!result[j] && j % i == 0) {
                    result[j] = true;
                }
            }
        }
        return result;
    }

    //max into array
    static int findMax(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

}
