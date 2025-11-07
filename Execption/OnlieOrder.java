package src;

import java.util.*;

public class OnlieOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        System.out.print("Enter product name: ");
        String product = sc.nextLine();

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        try {
            order.placeOrder(product, amount);
            System.out.println("Order placed successfully!");
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Order {
    void placeOrder(String product, double amount) throws OutOfStockException, PaymentFailedException {
        Random r = new Random();
        int chance = r.nextInt(3);

        if (chance == 0) {
            throw new OutOfStockException("Product '" + product + "' is out of stock.");
        } else if (chance == 1) {
            throw new PaymentFailedException("Payment of ₹" + amount + " failed.");
        } else {
            System.out.println("Processing order for " + product + "...");
        }
    }
}

class OutOfStockException extends Exception {
    OutOfStockException(String msg) {
        super(msg);
    }
}

class PaymentFailedException extends Exception {
    PaymentFailedException(String msg) {
        super(msg);
    }
}