package learning;

public class numberOfElements {
    public static void main(String[] args) {
        
        // 1. Given an array of integers, you need to find the number of elements whose value is greater than their index
        int[] arr = {10, 15, 20, 2, 5, 1, 10, 2};
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 3, 2, 1};
        int[] arr3 = {1, 2, 3, 4, 5};
        int N = 1;
        numberOfElement(arr);
        average(arr);
        palindrome(arr);
        palindrome(arr1);
        palindrome(arr2);*/
        move(arr3, N);
    }

    }
    static int numberOfElement(int [] arr) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                number++;
            }
        }
        System.out.println("Number of elements: " + number);
        return number;
    }

 
    // 2. Given an array of integers, you need to find the average value of the elements
    static int average(int [] arr) {
        int aver = 0;
        for (int j : arr) {
            aver += j;
        }
        int average = aver / arr.length;
        System.out.println("Average of elements: " + average);
        return average;
    }
    
     // 3. An array of integers is given, you need to answer whether it is a palindrome 
     // (for example: 12321 -> true, 123321 -> true, 123 -> false)
     * @return
     *//*
    static boolean palindrome(int [] arr) {
        int result = 0;
        boolean isPalindrome = false;
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            if (arr[i] == arr[j]) {
                result = 0;
            } else {
                result++;
            }
        }
        if (result == 0) {
            isPalindrome = true;
        }
        System.out.println(isPalindrome);
        return isPalindrome;
    }

    
     //  4. Given an array of integers, you need to shift its elements by N to the left.
     //  For example: arr = 1,2,3,4,5 , N = 2, result 3,4,5,1,2
     

    static void move(int[] arr, int b) {
        if (arr.length == 0) {
            return;
        }
        int shift = b % arr.length;

        int[] newArr = new int [arr.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        for (int i = 0; i < arr.length - shift; i++) {
            arr[i] = newArr[i + shift];
        }
        for (int i = 0; i < shift; i++) {
            arr[i + shift] = newArr[i];
        }

}




