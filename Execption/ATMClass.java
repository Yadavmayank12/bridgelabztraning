package src;
import java.util.Scanner;

public class ATMClass {
	
	    public static void main(String[] args) {
	        ATM atm = new ATM();
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter amount to withdraw: ");
	        int amount = sc.nextInt();

	        try {
	            atm.withdraw(amount);
	        } catch (InsufficientFundsException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

	class ATM {
	    int balance = 100000;

	    void withdraw(int amount) throws InsufficientFundsException {
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient balance");
	        } else {
	            balance -= amount;
	            System.out.println("Amount withdrawn: " + amount);
	            System.out.println("Remaining balance: " + balance);
	        }
	    }
	}

	class InsufficientFundsException extends Exception {
	    InsufficientFundsException(String msg) {
	        super(msg);
	    }
	}