package w6;
import java.util.*;


public class ArrayListtest {
    public static void main(String[] args) {

        // dynamic array of integers 
        ArrayList<Integer> arr = new ArrayList<>();

        // add to array --> .add()
        arr.add(20);
        arr.add(10);
        arr.add(30);

        // how to print
        System.out.println(arr);

        for(Integer i : arr) {
            System.out.println(i);
        }

        // remove a element --> remove using index --> .remove(idx)
        arr.remove(0);

        System.out.println(arr.contains(20));

        System.out.println(arr);
    }
}
