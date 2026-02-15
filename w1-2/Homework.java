import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // Homework Questions
        // 1) REPEAT --> Print the digits of the number
        // 2) Print the sum of digits of the number
        // 3) Print the square of the digits of the number
        // 4) Print the sum of square of the digits of the number

        // 5) CHALLENGING QUESTION --> print the reverse of the number 

        // 6) CHALLENGING QUESTION --> Print the digits of the number BUT USING FOR LOOP INSTEAD OF WHILE


        // ------------------ SOLUTION ------------------------

        // 1) 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();

        // basic  math
        // extract last digit --> % 10
        // remove last digit --> / 10

        // 1345 --> 5, 4, 3, 1
        //      --> 134, 13, 1, 0

        // from back to front

        System.out.println("From back to front");
        int cn = n;
        while(cn > 0) {
            int lastDigit = cn % 10;
            System.out.println(lastDigit);
            cn = cn / 10;
        }

        // from front to back
        cn = n;
        // convert to string
        String newNum = cn + ""; // converts to "4567"

        System.out.println("from front to back");
        for(int i = 0; i < newNum.length(); i++) {
            // how to extract characters
            // str.charAt(index);
            System.out.println(newNum.charAt(i));
        }

        // 2) sum of digits of the number
        // prereq --> extract digits
        System.out.println("Sum of digits");
        cn = n;
        int sum = 0;
        while(cn > 0) {
            int lastDigit = cn % 10;
            sum += lastDigit;
            cn = cn / 10;
        }
        System.out.println(sum);

        // 3)
        System.out.println("Square of the digits");
        cn = n;
        while(cn > 0) {
            int lastDigit = cn % 10;
            System.out.println(lastDigit * lastDigit);
            // System.out.println(Math.pow(lastDigit, 2));
            cn = cn / 10;
        }

        // 4) Reverse a number

        // 1)
        System.out.println("Reverse a number");
        cn = n;
        int rev = 0;
        while(cn > 0) {
            // last digit, calc rev using formula, remove the lastdigit
            int lastDigit = cn % 10;
            rev = rev * 10 + lastDigit;
            cn = cn / 10;
        }
        System.out.println(rev);

        // 2) String thingy

        // 3456
        // 0123

        // for i in range(len(s), 0, -1): 3 --> 0

        // str2[::-1]; --> INVALID in JAVA

        cn = n;
        String str2 = cn + "";
        // for(initialise; condition; update)
        for(int i = str2.length() - 1; i >= 0; i=i-1) {
            System.out.print(str2.charAt(i));
        } 

        // 6)
        System.out.println("From back to front but using for loop");

        // 456
        cn = n;
        while(cn > 0) {
            int lastDigit = cn % 10;
            System.out.println(lastDigit);
            cn = cn / 10;
        }

        // for(initilsation; condition; update)

        // initliasation --> cn = n
        // condition --> cn > 0
        // update --> cn = cn / 10

        for(int i = n; i > 0; i = i / 10) {
            int lastDigit = i % 10;
            System.out.println(lastDigit);
        }
    }
}
