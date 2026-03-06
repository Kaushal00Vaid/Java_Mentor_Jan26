package w4;

interface PaymentGateway {

    // abstract methods in interface
    void process(); // varies for every PaymentGateway
    // void func1();


    // concrete methods in interface ??

    default void func1() { 
        System.out.println("I am in interface PaymentGateway");
    }
}

interface Inter2 {
    void func3();

    default void func1() {
        System.out.println("I am in interface Inter2");
    }
}

interface Inter3 extends Inter2 {
    void func4();
}

class RazorPay implements PaymentGateway, Inter2 {
    public void process() {
        System.out.println("Processing payment via RazorPay");
    }

    // child class must override the duplicate default methods
    public void func1() {
        System.out.println("I am in razorpay");
    }
}

class CreditCard implements PaymentGateway {
    public void process() {
        System.out.println("Processing payment via Credit Card");
    }

    public void func1() {
        
    }
}

class UPIPayment implements PaymentGateway {
    public void process() {
        System.out.println("Processing via UPI");
    }

    public void func1() {
        
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        RazorPay rp = new RazorPay();
        rp.func1();
    }
}
