package learning;

public class BinarySearch {

    //1 3 4 5 6 7 8 9
    //6 - содержится или нет?
    //6 7 8 9
    //6 7
    //true

    //N, делим на 2 части: 2^x = N -> x = lg N

    static boolean search(int[] arr, int target) {
        return search(arr, 0, arr.length - 1, target);
    }

    private static boolean search(int[] arr, int leftIndex, int rightIndex, int target) {
        if (leftIndex > rightIndex) {
            return false;
        }
        int midIndex = (leftIndex + rightIndex) / 2;
        int midValue = arr[midIndex];
        if (midValue == target) {
            return true;
        } else if (midValue < target) {
            return search(arr, midIndex + 1, rightIndex, target);
        } else {
            return search(arr, leftIndex, midIndex - 1, target);
        }
    }

}
