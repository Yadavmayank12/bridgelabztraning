package src;


	import java.util.*;
	public class BankManager {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        BankTransactionManager bank = new BankTransactionManager();

	        System.out.print("Enter account number: ");
	        String accNo = sc.nextLine();

	        System.out.print("Enter withdrawal amount: ");
	        double amount = sc.nextDouble();

	        try {
	            bank.executeTransaction(accNo, amount);
	            System.out.println("Transaction successful!");
	        } 
	        catch (AccountNotFoundException e) {
	            System.out.println("Error: " + e.getMessage());
	        } 
	        catch (InsufficientFundsException e) {
	            System.out.println("Error: " + e.getMessage());
	        } 
	        catch (Exception e) {
	            System.out.println("Unexpected error: " + e.getMessage());
	        } 
	        finally {
	            System.out.println("Transaction complete.");
	        }
	    }
	}

	class BankTransactionManager {
	    Map<String, Double> accounts = new HashMap<>();

	    BankTransactionManager() {
	        accounts.put("ACC101", 5000.0);
	        accounts.put("ACC102", 2000.0);
	        accounts.put("ACC103", 10000.0);
	    }

	    void verifyAccount(String accNo) throws AccountNotFoundException {
	        if (!accounts.containsKey(accNo)) {
	            throw new AccountNotFoundException("Account not found: " + accNo);
	        }
	    }

	    void processTransaction(String accNo, double amount) throws InsufficientFundsException {
	        double balance = accounts.get(accNo);
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient balance for this transaction!");
	        } else {
	            accounts.put(accNo, balance - amount);
	        }
	    }

	    void executeTransaction(String accNo, double amount) throws Exception {
	        verifyAccount(accNo);
	        processTransaction(accNo, amount);
	    }
	}

	class AccountNotFoundException extends Exception {
	    AccountNotFoundException(String msg) {
	        super(msg);
	    }
	}

	class InsufficientFundsException extends Exception {
	    InsufficientFundsException(String msg) {
	        super(msg);
	    }
	}

