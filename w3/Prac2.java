package w3;

class Shape {
    void area() {
        System.out.println("Shape area");
    }
}

class Rectangle extends Shape {
    int l;
    int b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    // getting overriden
    void area() {
        System.out.println(l * b);
    }
}

class Square extends Shape {
    int a;

    Square(int a){
        this.a = a;
    }

    void area() {
        System.out.println(a * a);
    }
}

class Circle extends Shape {

    double r;

    Circle(double r) {
        this.r = r;
    }   

    void area() {
        System.out.println(3.14 * r * r);
    }
}

public class Prac2 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(); // Shape.area()

        Rectangle r = new Rectangle(5, 10);
        r.area(); // 50

        Square sq = new Square(5);
        sq.area(); // 25

        Circle c = new Circle(4.5);
        c.area(); // Cirlce.area()
    }
}
