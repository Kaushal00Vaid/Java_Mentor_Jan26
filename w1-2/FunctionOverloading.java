public class FunctionOverloading {
    
    // 3 --> functions --> area()
    // 1 --> area for circle
    // 2 --> area of rectangle
    // 3 --> area of square

    // circle
    static double area(double radius) {
        return 3.14 * radius * radius;
    }

    // differentiate between float and ouble
    // 3.14 --> 

    // rectangle
    static double area(double length, double breadth) {
        return length * breadth;
    }

    static double area(int INT1, double DOUBLE1) {
        return 0.0;
    }

    static double area(int INT1, int INT2) {
        return (double)INT1 + INT2;
        // return x + y * 1.0;
    }

    // square
    static double area(float side) {
        int a=9;
        // float b;
        return a + 10;
    }
    
    
    public static void main(String[] args) {
        
        area(5, 10); // int, int
        area(4.5); // circle
        area(4.5, 4.5);
        area(4);
    }
}
