package w7;

public class ExceptionTest {
    public static void main(String[] args) {

        System.out.println("I am before exception");
        try {
            int[] a = new int[5];
            int x = a[8];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("give a valid index");
        }

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("I cant divide by 0");
        } catch (NullPointerException e) {
            System.out.println("Handle nullpointer");
        } catch (Exception e) {
        }

        System.out.println("I am after exception");

    }
}