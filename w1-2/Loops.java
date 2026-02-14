import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n");
        int n = in.nextInt();

        // 1) print 1 to n
        // for(initialise; condition; update) {
        //      do your thing
        // }

        int i; // declaration of variable

        // System.out.println("Print from FOR loop");
        // for(i = 1; i <= n; i+=1){
        //     System.out.println(i);
        // }

        // value of i --> n

        // System.out.println("Print from WHILE loop");
        // i = 1; // go from 1 to n
        // while (i <= n){
        //     System.out.println(i);
        //     // i+=1;
        //     // i = i + 1;
        //     i++;
        // }


        //  checking if prime or not
        System.out.println("Prime or Not");

        if(n <= 1) {
            System.out.println("its not a prime");
        } else {
            boolean flag = true;
            for(i = 2; i < n; i++) {
                if(n % i == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            } 
        }

        // while loop
        System.out.println("This is from while loop");
        i = 2;
        boolean flag = true;
        int count = 0;

        while(i < n) {
            // when not a prime --> n % i == 0

            // number divisible by something except 1 and itself
            // --> not prime

            if(n % i == 0) {
                flag = false;
                count++;
                break;
            }
            i++;
        }

        if(count != 0) {
            System.out.println("Not a Prime");
        } else {
            System.out.println("Prime");
        }

        if(flag) {
            System.out.println("Prime");
        } else {
            System.out.println("Not a prime");
        }

        // to print digits of a number
        // i) get the last digit
        // ii) print the last digit
        // iii) remove last digit from the original number
        // REPEAT THESE 3 STEPS

        // REPEAT --> LOOP
        
        // while / for

        while(n > 0) {
            int lastDigit = n % 10; // getting the last digit
            System.out.println(lastDigit);
            n = n / 10; // remove last digit
        }


        System.out.println("Do While Testing");

        n = 5;
        // n > 5 && n < 10 --> n should be 6, 7, 8, 9
        while(n > 5 && n < 10) {
            System.out.println(n);
            n++;
            // compiler never reached here
        }

        // if the condition is this, do your thing.

        System.out.println("Do while thingy");
        n = 5;
        do {
            System.out.println(n);
            n++;
        } while(n > 5 && n < 10);

        // do this first and then check the condition







        // Homework Questions
            // 1) REPEAT --> Print the digits of the number
            // 2) Print the sum of digits of the number
            // 3) Print the square of the digits of the number
            // 4) Print the sum of square of the digits of the number

            // 5) CHALLENGING QUESTION --> print the reverse of the number 

            // 6) CHALLENGING QUESTION --> Print the digits of the number BUT USING FOR LOOP INSTEAD OF WHILE
    }
}
