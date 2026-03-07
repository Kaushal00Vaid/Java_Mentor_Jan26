// package w4;
// import java.util.*;

// interface MyIterator {
//     boolean hasNext();
//     int getNext();
// }

// class Iterator implements MyIterator {
//     int idx = 0;
//     int numberOfElements;
//     int[] arr;

//     // constructor
//     Iterator(int numberOfElements, int[] arr) {
//         this.numberOfElements = numberOfElements;
//         this.arr = arr;
//     }

//     public boolean hasNext() {
//         return idx < numberOfElements;
//     }

//     public int getNext() {
//         int i = arr[idx];
//         idx++;
//         return i;
//     }
// }

import java.util.ArrayList;
import java.util.List;

public class IterableTest {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4};
        // Iterator  ob = new Iterator(4, arr);

        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(5);
        list.add(3);


        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.getNext());
        }
    }
}
