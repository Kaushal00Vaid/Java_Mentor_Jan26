package w6;
import java.util.*;


public class HashMapTest {
    public static void main(String[] args) {
        

        // dict --> HashMap / TreeMap
        // key value pair
        // key is always unique

         // // LinkedHashMap
        // // TreeMap
        // // HashMap

        // declaration
        Map<String, Integer> hash = new HashMap<>();

        // put(key, value)  --> add key value pair to hashmap
        hash.put("Akubr", 20);
        hash.put("Eaelih", 60);
        hash.put("K", 50);
        hash.put("B", 30);
        hash.put("Dawlfiyh", 50);
        hash.put("C", 40);
        
        System.out.println(hash); // HashMap

        // declaration
        Map<String, Integer> tree = new TreeMap<>();

        // put(key, value)  --> add key value pair to hashmap
        tree.put("Akubr", 20);
        tree.put("Eaelih", 60);
        tree.put("K", 50);
        tree.put("B", 30);
        tree.put("Dawlfiyh", 50);
        tree.put("C", 40);
        
        System.out.println(tree); // Tree

        // declaration
        Map<String, Integer> lh = new LinkedHashMap<>();

        // put(key, value)  --> add key value pair to hashmap
        lh.put("Akubr", 20);
        lh.put("Eaelih", 60);
        lh.put("K", 50);
        lh.put("B", 30);
        lh.put("C", 40);
        lh.put("Dawlfiyh", 50);
        
        System.out.println(lh); // Linked

        // // get(key) --> returns a value for a particular key
        // System.out.println(hash.get("K"));

        // if(hash.get("str") == null) {
        //     System.out.println("Not there");
        // }

        // hash.put("E", 40);

        // System.out.println(hash.get("E"));

        // // whatever the value of current E is --> i want to add 20 to it
        // hash.put("E", hash.get("E") + 20);

        // // whatever the value of current K is --> i want to add 20 to it
        // // hash.put("K", hash.get("K") + 20); // EXCEPTION

        // // hash.put("K", hash.get("K") + 20);

        // System.out.println(hash.getOrDefault("K", 10) + 20);

        // hash.size(); // get the length
        
        // if(hash.containsKey("K")) {

        // }

        // // how to iterate through the hashmap
        // // keySet() --> {A, B, C}
        // // entrySet() --> {A:1, B:2, C:4}

        // for(String i : hash.keySet()) {
        //     System.out.println(i);
        // }


       

    }
}