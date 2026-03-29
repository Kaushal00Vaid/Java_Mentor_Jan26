package w7;

import java.util.Scanner;

public class AssertionTest {

    public static double myFn(double x) {
        assert x >= 0;

        return 0.0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        myFn(-4.9);

        System.out.println("i am after assertion");
    }
}
