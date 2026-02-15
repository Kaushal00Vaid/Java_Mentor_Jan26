


public class Functions {
    // define a function that takes 2 integer inputs and returns string

    // nonstatic
    String func1(int a, int b) {
        return "";
    }

    // static func
    static String func1Static(int a, int b) {
        return "";
    }

    // calculate area of a square

    // what i neeed as input --> side of the square
    // what i need to return --> side^2 --> whatever we take as input

    // accept int
    int area(int a) {
        return a * a;
    }

    // accept double
    double area(double a) {
        return a * a;
    }

    // define a function area --> that accepts radius and returns area of circle
    double areaCircle(int a) {
        return 3.14 * a * a;
    }

    // take 2 inputs and return true if the second number is divisible by the first number else return false

    // what to take input --> 2 int variables
    // return type --> boolean

    boolean func3(int a, int b) {
        if(a == 0) {
            return false;
        }
        if(b % a == 0) {
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        Functions fObj = new Functions();
        fObj.func1(4, 4);

        func1Static(4, 4); // without an object

        System.out.println();
    }
}