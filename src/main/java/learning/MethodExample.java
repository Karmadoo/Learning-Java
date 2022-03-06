package learning;

public class MethodExample {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        increaseArrayElements(arr);
    }

    static void increaseArrayElements(int[] arr) {
        //arr = new int[] {2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

    public static void main2(String[] args) {
        int a = 10;
        int b = 20;
        int sum = sum(a, b);
        System.out.println(sum);
        System.out.println(a);
        System.out.println(b);
    }

    static int sum(int x, int y) {
        x = x + 5;
        return x + y;
    }

    static void prettyPrint(int x) {
        System.out.println("--==" + x + "==--");
    }

}
