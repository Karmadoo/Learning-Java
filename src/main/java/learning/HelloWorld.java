package learning;

public class HelloWorld {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                System.out.println("x = %s, y = %s, result = %s".formatted(i, j, result));
            }
        }
    }

    public static void main2(String[] args) {
        int x = 10;
        if (x > 10) {
            System.out.println("more");
        } else {
            int y = 12;
            System.out.println("Eq or less");
            System.out.println(y);
        }
        //System.out.println(y);
        int counter = 0;
        while (counter < 5) {
            //System.out.println(counter);
            counter = (counter + 1);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) { //is even
                System.out.println(i);
            }
        }
    }

}
