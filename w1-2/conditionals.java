import java.util.*;

public class conditionals {
    public static void main(String[] args) {
        // if statements

        // if(condition) {
                // body
        // }
        // else if(condition) {
                // body
        // }
        // else {
                // body
        // }

        // create if else ladders and print the grade after taking input of marks from the user

        // 90 - 100 --> Grade A
        // 80 - 89 --> Grade B
        // 70 - 79 --> Grade C
        // 60 - 69 --> Grade D
        // 50 - 59 --> Repeat
        // < 50 --> Failed
        // the input is valid (0 - 100), if not , then print "invalid marks"

        // input

        // 1) Creating a Scanner object
        Scanner in = new Scanner(System.in);

        // 2) input marks
        int marks = in.nextInt();

        if(marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        }
        else {
            // actuals conditions
            if (marks >= 90 && marks <= 100) {
                System.out.println("Grade A");
            }
            if(marks >= 80 && marks <= 89){
                System.out.println("Grade B");
            }
            if(marks >= 70 && marks <= 79) {
                System.out.println("Grade C");
            }
            if(marks >= 60 && marks <= 69) {
                System.out.println("Grade D");
            }
            if(marks >= 50 && marks <= 59) {
                System.out.println("Repeat");
            } 
            if(marks < 50) {
                System.out.println("Failed");
            }
        }


                                // Switch Case
        
        System.out.println("Enter a number");
        int num = in.nextInt();

        if(num < 1 || num > 7) {
            System.out.println("Invalid Week no.");
        } else {
            if(num == 1) {
                System.out.println("Sunday");
            }
            if(num == 2) {
                System.out.println("Monday");
            }
            if(num == 3) {
                System.out.println("Tue");
            }
            if(num == 4) {
                System.out.println("Wed");
            }
            if(num == 5) {
                System.out.println("Thur");
            }
            if(num == 6) {
                System.out.println("Fri");
            }
            if(num == 7) {
                System.out.println("Sat");
            }
        }

        System.out.println("--------------");

        switch(num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("invalid");
        }


                        // SIMPLE CALCULATOR 
        // you have to accept a character and 2 inputs
        // it can be +, -, *, /, %, ^
        // task --> + --> print a + b
        // task --> - --> subtract
        // task --> * --> multiplt
        // task --> / --> divide
        // task --> % --> remainder
        // task --> ^ --> power a^b

        // a = 1, b = 2, c = 4
        // d = a++ + b-- * b + --b * a + c % 3 % c-- + --c

        // practice inputs and outputs
    }
}
