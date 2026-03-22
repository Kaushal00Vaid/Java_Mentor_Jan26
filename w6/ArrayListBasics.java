package w6;

// util package
import java.util.*;

class CustomArrayList extends ArrayList<Integer> {
    ArrayList<Integer> a;

    CustomArrayList(ArrayList<Integer> arr) {
        a = arr;
    }

    public String toString() {
        String x = "[";
        for(Integer i : a) {
            x += i + "" + ", ";
        }

        x += "]";

        return x;
    }
}

public class ArrayListBasics {

    public static void print(ArrayList<Integer> arr) {
        for(Integer i : arr) {
            System.out.print(i + ", ");
        }

        System.out.println();

        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + ", ");
        }
    }

    public static void main(String[] args) {

        // declaring ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        // adding a element
        arr.add(20);
        arr.add(50);
        arr.add(60);
        arr.add(10);

        // Object removal
        arr.remove((Integer) 20);

        // print the arraylist
        // either directly call the print()
        // System.out.println(arr);

        CustomArrayList c = new CustomArrayList(arr);

        System.out.println(c);

        // print(arr);


        // Question 1
        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(10);
        intArr.add(20);
        intArr.add(30);
        intArr.add(40);

        // remove 20
        intArr.remove(1);
        // intArr.remove((Integer) 20);

        // check if 30 is there or not
        if(intArr.contains(30)) {
            System.out.println("30 present");
        } else {
            System.out.println("30 not present");
        }

        System.out.println("Array: " + intArr + "\nSize: " + intArr.size());

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the index you what to fetch");
        int idx = in.nextInt();
        if(idx >= intArr.size()) {
            System.out.println("Index out of bound");
        } else {
            System.out.println("Elem --> " + intArr.get(idx));
        }

        in.close();
    }
}