package w4;

interface CanEat {
    void eat();
}

interface CanRun {
    void run();
}

class XYZ implements Flyable{

}

interface Flyable extends CanEat, CanRun {
    void fly();
}

interface ABC extends CanRun {

}

class 

interface Swimmable extends CanEat {
    void swim();
}



public class InterfaceTest2 {
    
}
