package w3;

class Addition {
    // int add() {
    //     return 10 + 15;
    // }

    int add(int a) {
        return a + 10;
    }

    // int add(int a, int b) {
    //     return a + b;
    // }

}

class AdditionChild extends Addition {
    int add() {
        return 40 + 50;
    }

    // int add(int a) {
    //     return a + 40;
    // }
}

public class Prac3 {
    public static void main(String[] args) {
        AdditionChild ac = new AdditionChild();

        ac.add(); // --> 90

        ac.add(30); // --> 40
    }
}
