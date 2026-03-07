package w4;

abstract class ClassName {
    public abstract void func1();

    // returns a + 10
    abstract int xyz(int a);

    int abc() {
        return 10;
    };

    abstract int xyz(int a, int b);
}

abstract class ClassName2 extends ClassName {
    abstract void func5();

    int xyz(int a) {
        return 0;
    }
}

class className3 extends ClassName2 {
    int xyz(int a, int b) {
        return a  + b;
    }

    void func5() {};

    public void func1(){};

}

class AbstractTest extends ClassName {
    public void func1() {
        System.out.println("I am overriding the func1");
    }

    int xyz(int a) {
        return a +10;
    }

    int xyz(int a, int b) {
        return a + b;
    }
}

public class Test {
    public static void main(String[] args) {
        ClassName obj = new AbstractTest();
    }
}