package w5;
import java.util.*;

class Animal {
    void func() {
        System.out.println("I am in animal class");
    }
}

class Cat extends Animal {

}

class Dog extends Animal {
    
    public static void print(List<? super Number> arr) {
        for(Number i : arr) {
            System.out.println(i);
        }

        arr.add((Number) 20);
    }
}

// declaring generics
class Box <T extends Animal> {
    
}



public class AnimalTest {
    public static void main(String[] args) {
        Box<Animal> b1 = new Box<Animal>();


        // using generics
        // Box<Integer> b2 = new Box<Integer>();

        Box<Animal> b3 = new Box<Animal>();
        Box<Cat> b4 = new Box<Cat>();
        Box<Dog> b5 = new Box<Dog>();

        
    }
}
