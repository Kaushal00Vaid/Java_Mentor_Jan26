package w5;

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
}

class GoldFish {
    public void func() {
        System.out.println("Hi from goldfish");
    }
}

class Shark {
    public void func() {
        System.out.println("Hi from shark");
    }
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

        // RAW TYPING
        Aquarium generalAq = new Aquarium(g1, s1);
    }
}
