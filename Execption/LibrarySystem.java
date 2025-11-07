package src;

import java.util.*;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int ch = sc.nextInt();
            sc.nextLine();

            try {
                if (ch == 1) {
                    System.out.print("Enter book name: ");
                    String book = sc.nextLine();
                    lib.borrowBook(book);
                } else if (ch == 2) {
                    System.out.print("Enter book name: ");
                    String book = sc.nextLine();
                    lib.returnBook(book);
                } else if (ch == 3) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid choice");
                }
            } catch (BookNotAvailableException e) {
                System.out.println(e.getMessage());
            } catch (InvalidReturnException e) {
                System.out.println(e.getMessage());
            } catch (UserLimitExceededException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Library {
    Map<String, Boolean> books = new HashMap<>();
    List<String> borrowed = new ArrayList<>();

    Library() {
        books.put("Java Basics", true);
        books.put("OOP Concepts", true);
        books.put("Data Structures", true);
        books.put("Networking", true);
        books.put("Database Systems", true);
    }

    void borrowBook(String book) throws BookNotAvailableException, UserLimitExceededException {
        if (borrowed.size() >= 5) {
            throw new UserLimitExceededException("Cannot borrow more than 5 books.");
        }
        if (!books.containsKey(book)) {
            throw new BookNotAvailableException("Book not found in library.");
        }
        if (!books.get(book)) {
            throw new BookNotAvailableException("Book is already borrowed by someone else.");
        }
        books.put(book, false);
        borrowed.add(book);
        System.out.println("You borrowed: " + book);
    }

    void returnBook(String book) throws InvalidReturnException {
        if (!borrowed.contains(book)) {
            throw new InvalidReturnException("You cannot return a book you haven't borrowed.");
        }
        borrowed.remove(book);
        books.put(book, true);
        System.out.println("You returned: " + book);
    }
}

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

class InvalidReturnException extends Exception {
    InvalidReturnException(String msg) {
        super(msg);
    }
}

class UserLimitExceededException extends Exception {
    UserLimitExceededException(String msg) {
        super(msg);
    }
}