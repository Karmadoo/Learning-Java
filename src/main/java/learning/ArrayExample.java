package learning;

public class ArrayExample {

    public static void main(String[] args) {
        int[] myArray = {1, 5, 7, 8};
        int sum = arraySum(myArray);
        System.out.println(sum);
    }

    static int arraySum(int[] arr) {
        int result = 0;
        //arr.fori
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            result += value;
        }
        return result;
    }

    //psvm
    public static void main2(String[] args) {
        int[] arr = new int[10];
        boolean[] arr2 = new boolean[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

}
