package w4;

interface PizzaReadyCallback {
    void onPizzaReady(String pizza);
}

class PizzaShop {
    void makePizza(PizzaReadyCallback cb) {
        System.out.println("Baking pizza");
        cb.onPizzaReady("Margherita");
    }
}

class MyPizza implements PizzaReadyCallback {
    public void onPizzaReady(String pizza) {
        System.out.println("Got callback" + pizza);
    }
}


public class CallbacksTest {
    public static void main(String[] args) {
        PizzaShop ob = new PizzaShop();

        // ob.makePizza(new PizzaReadyCallback() {
        //     public void onPizzaReady(String pizza) {
        //         System.out.println("Got callback" + pizza);
        //     }
        // });

        ob.makePizza(new MyPizza());
    }
}
