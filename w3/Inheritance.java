package w3;

class Parent {
    String name;
    int age;
    private int pvtBalance;

    int locker() {
        return 10000;
    }

    private int parentLocker() {
        return 20000;
    }
}

class Child extends Parent {
    public void printLocker() {
        locker();
        parentLocker();

        super.name = "wfuihb";

        super.pvtBalance = 98236589;
    }


    public static void main(String[] args) {
        
    }
}

public class Inheritance {
    public static void main(String[] args) {
        
    }
}
