package w5;

public class Basics {

    // Object

    // everything extends Object (under the hood)
    // int, float, double are not objects (primitive datatypes)

    public static <T> void print(T[] arr) {
        for(T i : arr) {
            System.out.println(i);
        }
    }

    // public static void print(Object[] arr) {
    //     for(Object i : arr) {
    //         System.out.println(i);
    //     }
    // }

    public static void main(String[] args) {

        // int[] arr = new int[]{1, 2, 3, 4};
        Integer[] arr = new Integer[]{1, 2, 3, 4};

        int x = 4;
        // automatically converts to
        // Integer x = 4;

        // Integer --> int
        // Double --> double
        // Float --> float

        print(arr);
    }
}