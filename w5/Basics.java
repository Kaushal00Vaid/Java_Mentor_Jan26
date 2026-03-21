package w5;
import java.util.*;

public class Basics {

    // Object

    // everything extends Object (under the hood)
    // int, float, double are not objects (primitive datatypes)

    public static <T> void print(T[] arr) {
        for(T i : arr) {
            System.out.println(i);
        }
    }

    // throw at me any arrayList
    public static void print(ArrayList<? extends Number> arr) {
        for(Number i : arr) {
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

        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(20);
        intArr.add(39);
        intArr.add(40);

        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("Hello");
        strArr.add("World");

        print(intArr); // ArrayList<?>
        print(strArr); // ArrayList<?>

        print(arr); // T[]
    }
}