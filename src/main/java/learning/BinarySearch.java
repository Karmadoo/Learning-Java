package learning;

public class BinarySearch {

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
