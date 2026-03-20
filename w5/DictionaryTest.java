package w5;

class Dictionary <T, V> {
    private T key;
    private V value;

    // constructor
    Dictionary(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class CustomArray <T> {
    // array of Dictionaries

    // Dictionary<String, Int>
    // Dictionary<Double, FLoat>

    private T[] arr;
    private int size;

    CustomArray(int capacity) {
        // initialise the array
        arr = (T[]) new Object[capacity];

        // store the size of array
        size = 0;
    }

    // add()
    public void add(T element) {
        if(size == arr.length) {
            System.out.println("Sorry!, Array is full");
            return;
        }

        arr[size++] = element;
    }
}

public class DictionaryTest {
    public static void main(String[] args) {
        Dictionary<String, Integer> d1 = new Dictionary<String, Integer>("Key1", 20);

        Dictionary<String, Integer> d2 = new Dictionary<>("Key2", 40);

        Dictionary<String, Integer> d3 = new Dictionary<String, Integer>("Key3", 30);

        Dictionary<Float, Integer> d4 = new Dictionary<>(4.5f, 20);

        // custom array of dictionary<string, integer>
        CustomArray<Dictionary<String, Integer>> custom = new CustomArray<>(3);

        custom.add(d1);
        custom.add(d2);
        custom.add(d3);

        // it should be dict<string, integer>
        // custom.add(d4); // ERROR
    }
}
