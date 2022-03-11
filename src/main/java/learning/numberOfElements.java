package learning;

public class numberOfElements {
    public static void main(String[] args) {
        /**
         * 1. Задан массив целых чисел, нужно найти количество элементов, значение которых больше чем их индекс
         */
        int[] arr = {10, 15, 20, 2, 5, 1, 10, 2};
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                number++;
            }
        }
        System.out.println("Number of elements: " + number);

        /**
         * 2. Задан массив целых чисел, нужно найти среднее значение элементов
         */

        int aver = 0;
        for (int j : arr) {
            aver += j;
        }
        int average = aver / arr.length;
        System.out.println("Average of elements: " + average);

        /**
         * 3. Задан массив целых чисел, нужно ответить является ли он палиндромом (например: 12321 -> true, 123321 -> true, 123 -> false)
         */
        //int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 3, 2, 1};
        //int[] arr3 = {1, 2, 3, 3};
        int result = 0;
        boolean isPalindrome = false;
        for (int i = 0, j = arr2.length - 1; i < arr2.length; i++, j--) {
            if (arr2[i] == arr2[j]) {
                result = 0;
            } else {
                result++;
            }
        }
        if (result == 0){
            isPalindrome = true;
        }
        System.out.println(isPalindrome);

        /**
         * 4. Задан массив целых чисел, нужно сдвинуть его элементы на N влево.
         * Например: arr = 1,2,3,4,5 , N = 2, результат 3,4,5,1,2
         */
    }
}


