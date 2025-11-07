package src;

import java.util.*;

public class MovieBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie booking = new Movie();

        System.out.print("Enter seat number to book (1-10): ");
        int seat = sc.nextInt();

        try {
            booking.bookSeat(seat);
            System.out.println("Seat " + seat + " booked successfully!");
        } catch (InvalidSeatException e) {
            System.out.println(e.getMessage());
        } catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Movie {
    Set<Integer> bookedSeats = new HashSet<>();
    int totalSeats = 10;

    void bookSeat(int seat) throws InvalidSeatException, SeatAlreadyBookedException {
        if (seat < 1 || seat > totalSeats) {
            throw new InvalidSeatException("Invalid seat number! Please choose between 1 and 10.");
        }
        if (bookedSeats.contains(seat)) {
            throw new SeatAlreadyBookedException("Sorry! Seat " + seat + " is already booked.");
        }
        bookedSeats.add(seat);
    }
}

class InvalidSeatException extends Exception {
    InvalidSeatException(String msg) {
        super(msg);
    }
}

class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String msg) {
        super(msg);
    }
}