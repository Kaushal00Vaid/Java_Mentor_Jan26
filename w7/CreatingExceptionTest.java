package w7;

import java.util.Scanner;

// custom exception
// class CustomExceptionName extends Exception --> call the constructor

// whenever user enters 5 --> i have throw this exception
class CustomException extends Exception {
    public CustomException() {
        super();
    }
}

public class CreatingExceptionTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        try {
            if (n == 5) {
                throw new CustomException();
            }
        } catch (CustomException e) {
            System.out.println("Handled the custom Ex eption");
        }
    }
}
