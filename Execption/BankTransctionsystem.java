package src;
import java.util.*;

public class BankTransctionsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transaction t = new Transaction(10000);

        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();

        try {
            t.process(amount);
            System.out.println("Transaction successful!");
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Transaction {
    double balance;

    Transaction(double balance) {
        this.balance = balance;
    }

    void process(double amount) throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        if (amount < 0) {
            throw new NegativeAmountException("Transaction failed: Negative amount not allowed.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Transaction failed: Insufficient balance.");
        }

        Random r = new Random();
        int x = r.nextInt(3);
        if (x == 0) {
            throw new NetworkFailureException("Transaction failed: Network issue occurred.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " transferred successfully.");
        }
    }
}

class NegativeAmountException extends Exception {
    NegativeAmountException(String msg) {
        super(msg);
    }
}

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

class NetworkFailureException extends Exception {
    NetworkFailureException(String msg) {
        super(msg);
    }
}