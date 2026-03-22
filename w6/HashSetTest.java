package w6;
import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();

        hash.add("Kaushal");
        hash.add("Hello");
        hash.add("World2");
        hash.add("World");
        hash.add("Kaushal");
        hash.add("Kaushal");



        // contains()
       System.out.println(hash.contains("Kaushal"));
       System.out.println(hash.contains("aswkjfgukweb"));

        // remove()
        hash.remove("World2");
        

        System.out.println(hash); // --> {Kaushal, Hello, World}

        // order is jumbled --> not the same as we enter it
        // YOU CANT PREDICT THE ORDER IN HASHMAP, HASHSET
    }
}
