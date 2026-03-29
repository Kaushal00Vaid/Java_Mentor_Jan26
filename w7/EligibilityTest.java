package w7;

// create Eligibility class --> has isEligibility(int age) --> throws custom InvalidEligibility Exception

class InvalidAgeException extends Exception {
    // constructor
    InvalidAgeException() {
        super();
    }

    InvalidAgeException(String msg) {
        super(msg);
    }

}

class Eligibility {
    public boolean isEligible(int age) throws InvalidAgeException {
        if (age >= 18) {
            return true;
        } else {
            throw new InvalidAgeException("I cant vote");
        }
    }
}

public class EligibilityTest {
    public static void main(String[] args) {
        Eligibility ob = new Eligibility();

        try {
            boolean flag = ob.isEligible(3);
            if (flag) {
                System.out.println("Valid Age");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
