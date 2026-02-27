package w3;

class Vehicle {
    String numberPlate;
    String brand;

    Vehicle(String n, String b) {
        numberPlate = n;
        brand = b;
    }

    void printDet() {
        System.out.println("NB: " + numberPlate);
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    String engineType;

    Car(String n, String b, String e) {
        super(n, b);
        engineType = e;
    }

    void printDet() {
        System.out.println("Car: " + engineType);
    }
}

class Bike extends Vehicle {
    boolean isElectric;

    Bike(String n, String b, boolean isElec) {
        super(n, b);
        isElectric = isElec;
    }

    void printDet() {
        System.out.println("Bike: " + isElectric);
    }
}

public class Prac {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("JH05Ab1234", "Tata");

        v.printDet(); // --> Vehicle.printDet();

        Car c = new Car("Car1", "Brand1", "V12");

        c.printDet(); // Car.printDet();
    }
}
