package w5;
import java.util.*;

class Fish extends Animal{

}


// i have to make this class a general class but with a constraint

// Aquarium <GoldFish>
class Aquarium <T> {
    private T fish1;
    private T fish2;

    Aquarium(T f1, T f2) {
        this.fish1 = f1;
        this.fish2 = f2;
    }

    // getter
    public T getFish1() {
        return fish1;
    }
    public T getFish2() {
        return fish2;
    }

    public void print(ArrayList<? super Fish> aquarium) {
        // for(Animal i : aquarium) {
        //     System.out.println(i);
        // }

        aquarium.add(new GoldFish());
        aquarium.add(new Animal());
        aquarium.add(new Fish());
    }

    public void operate(ArrayList<? extends Fish> aquarium) {

    }
}

class GoldFish extends Fish {
    public void func() {
        System.out.println("Hi from goldfish");
    }
}

class Shark extends Fish {
    public void func() {
        System.out.println("Hi from shark");
    }
}

class Animal {

}

public class AquariumTest {
    public static void main(String[] args) {

        GoldFish g1 = new GoldFish();
        Shark s1 = new Shark();

        // Aquarium aq = new Aquarium(g1, s1);

        // ERROR
        // Aquarium<GoldFish> goldAq = new Aquarium<GoldFish>(g1, s1);


        // ERROR
        // Aquarium<Shark> sharkAq = new Aquarium<Shark>(s1, g1);

        ArrayList<>

        // RAW TYPING
        Aquarium generalAq = new Aquarium(g1, s1);
    }
}
