package src;

import java.util.*;

public class FlightBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flight booking = new Flight();

        System.out.print("Enter number of seats you want to book: ");
        int seats = sc.nextInt();

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        try {
            booking.bookTicket(seats, amount);
            System.out.println("Flight booked successfully!");
        } 
        catch (SeatUnavailableException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (PaymentFailedException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } 
        finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}

class Flight {
    int availableSeats = 5;

    void checkSeatAvailability(int seats) throws SeatUnavailableException {
        if (seats > availableSeats) {
            throw new SeatUnavailableException("Not enough seats available!");
        }
    }

    void processPayment(double amount) throws PaymentFailedException {
        if (amount < 1000) { 
            throw new PaymentFailedException("Payment failed! Insufficient amount.");
        }
    }

    void bookTicket(int seats, double amount) throws Exception {
        checkSeatAvailability(seats);
        processPayment(amount);
    }
}

class SeatUnavailableException extends Exception {
    SeatUnavailableException(String msg) {
        super(msg);
    }
}

class PaymentFailedException extends Exception {
    PaymentFailedException(String msg) {
        super(msg);
    }
}