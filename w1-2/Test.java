class BankAccount{
    // private instance variables
    private String accHolder;
    private double balance;
    private String[] nominees;

    // constructors
    BankAccount(String accHolder_, double balance, String[] nominees){
        accHolder = accHolder_;
        this.balance = balance;
        this.nominees = nominees;
    }

    // copy constructor
    BankAccount(BankAccount b) {
        accHolder = b.accHolder;
        balance = b.balance;
        // nominees = b.nominees; // SHALLOW COPY
        
        // deep copy
        nominees = new String[b.nominees.length];
        
        for(int i = 0 ; i < nominees.length; i++) {
            nominees[i] = b.nominees[i];
        }
    }

    // deposit method
    void deposit(double money) {
        balance += money;
    }

    double withdraw(double money) {
        if(balance >= money) {
            balance -= money;
            return money;
        } else {
            return -1.0;
        }
    }

    // getters and setters
    // getter and setter for accHolder
    String getAccHolder() {
        return accHolder;
    }
    void setAccHolder(String newAccHolder) {
        accHolder = newAccHolder;
    }

    // getter and setter for balance
    double getBalance() {
        return balance;
    }
    void setBalance(double newBalance) {
        balance = newBalance;
    }

    // getter and setter for nominees
    // 1) set a whole array
    // 2) change a particular index
    String[] getNominees() {
        return nominees;
    }
    void setNominee(String[] newNominees) {
        nominees = newNominees;
    }
    void setNominee(String newNomineeName, int idx) {
        if(idx == -1) {
            System.out.println("I cant change sorryy");
            return; // just return dont do anything
        }
        nominees[idx] = newNomineeName;
    }

    int findThisNominee(String name) {
        // int idx = 0;
        // for(String i : nominees) {
        //     if(i == name) {
        //         return idx; // i got the nominee
        //     }

        //     idx++;
        // }

        for(int i = 0; i < nominees.length; i++) {
            if(nominees[i] == name) {
                return i;
            }
        }

        return -1; // nominee is not in the array
    }
}


public class Test {
    static void printDetails(BankAccount b) {
        System.out.println("Acc Holder: " + b.getAccHolder());
        System.out.println("Current Balance: " + b.getBalance());
        System.out.println("Nominees: ");
        for(String i : b.getNominees()) {
            System.out.println(i);
        }
    }
    
    
    public static void main(String[] args) {

        String[] arr = new String[]{"Mother", "father", "sister"};

        BankAccount b1 = new BankAccount("Kaushal", 50000, arr);
        // ["Mother", "father", "sister"]

        BankAccount b2 = new BankAccount(b1);

        b2.setBalance(40000);
        b2.setAccHolder("Dhruv");
        b2.setNominee("brother", b2.findThisNominee("sister"));

        System.out.println("Details of B1");
        printDetails(b1);

        System.out.println();

        System.out.println("Details of B2");
        printDetails(b2);
        
    }
}
