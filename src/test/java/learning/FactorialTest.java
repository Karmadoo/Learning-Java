package learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void test() {
        int x = 5;
        assertEquals(RecursionExample.factorialIter(x), RecursionExample.factorialRec(x));
    }


}
