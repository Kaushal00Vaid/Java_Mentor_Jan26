import java.util.Scanner;

public class syntax {

    // The very first thing that is ran is this
    public static void main(String[] args) {
        // Write your code here

        // printing something -- OUTPUT
        System.out.println("hello world");


        // HOW to take INPUTS
        // a = int(input())

        // ClassName objName = new ClassName();
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter a integer");
        
        // int a = in.nextInt();
        // System.out.println("I entered: " + a);

        // // To enter a String

        // // 1) in.next()       --> single word
        // // 2) in.nextLine();  --> sentences
        // String str = in.next();
        // System.out.println(str);

        // // hello world\n

        // in.nextLine(); // --> to clear empty line

        // String name = in.nextLine();
        // System.out.println("I entered name: " + name);

        // // int, string --> what about other datatypes

        // // int a = in.nextInt();
        // float f = in.nextFloat();
        // double d = in.nextDouble();

        // // Arithmetic operators
        
        // // enter 2 inputs from the user
        // // Scanner in = new Scnaner(System.in);

        System.out.println("Enter 2 integers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2); // integer division --> 5 / 10
        System.out.println(num1 % num2); // remainder

        // how to actually get floating division
        // 1) eithr get the float input and do division directly on that floating value
        System.out.println(9.0 / 2);

        // 2) if i want to use int for float division
        System.out.println(9 * 1.0 / 2);

        float x = 9.0f;
        System.out.println("----" + x / 2);

        x = 9 / 2; // -> 9 / 2 --> 4 --> since we are storing it in float  -->it type casts to float --> 4.0

        System.out.println("---- x ----" + x);


                    // MATH CLASS
        
        // abs, pow, max, min, ...
        System.out.println(Math.max(2, 4));
        System.out.println(Math.min(2, 4));
        System.out.println(Math.abs(-2));
        System.out.println(Math.pow(3, 3)); // a^b --> **

        // l = min(1, 2, 3, 4, 5, 10 ); --> VALID in PYTHON

        int mini = Math.min(2, Math.min(3, Math.min(4, Math.min(5, 6))));


                    // relational OPERATORS
        
        System.out.println(5 < 0); // --> false
        System.out.println(5 >= 0); // --> true
        System.out.println(5 == 5); // --> true
        System.out.println(5 != 5); // --> false


                    // LOGICAL OPERATORs
        System.out.println(5 > 0 && 5 <= 0); // --> false
        System.out.println(5 > 0 || 5 <= 0); // --> true
        System.out.println(!true); // --> false 
    }

}
