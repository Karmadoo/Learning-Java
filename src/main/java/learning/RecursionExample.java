package learning;

public class RecursionExample {

    public static void main(String[] args) {
        printAllLess(5);
    }

    static void printAllLess(int x) {
        if (x < 0) {
            return;
        }
        System.out.println(x);
        printAllLess(x - 1); //tail recursion
    }

    //5! = 1 * 2 * 3 * 4 * 5
    static int factorialIter(int x) {
        int result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    //5! = (1 * 2 * 3 * 4) * 5 = 4! * 5
    //x! = (x-1)! * x, x > 1;   x == 1 -> x! = 1

    static int factorialRec(int x) {
        if (x <= 1) {
            return 1;
        }
        return x * factorialRec(x - 1);
    }




}
