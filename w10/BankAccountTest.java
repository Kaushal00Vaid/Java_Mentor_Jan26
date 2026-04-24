package w10;

class BankAccount {
    private int balance = 1000;
    private int transactionCount = 0;

    // deposit()
    public synchronized void deposit(int amount) {
        balance += amount;
        transactionCount++;

        System.out.println("Deposited " + amount + " | balance " + balance + " txsn " + transactionCount);
    }

    // waithdraw()
    public synchronized void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionCount++;

            System.out.println("Withdraw " + amount + " | balance " + balance + " txsn " + transactionCount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // getter for balance
    public int getBalance() {
        return balance;
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        // 1000

        Thread depositor = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                acc.deposit(100);
            }
        });
        // balance --> 1500

        Thread withdrawer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                acc.withdraw(80);
            }
        });
        // balance --> 1100

        depositor.start();
        withdrawer.start();

        try {
            depositor.join();
            withdrawer.join();
        } catch (Exception e) {
            System.out.println("Exception occured");
        }

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
