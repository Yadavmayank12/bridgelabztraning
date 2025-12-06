import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;
public class MainApp {
    public static void main(String[] args) {
        Book b = new Book("Java Programming");
        Member m = new Member("Ankit Saraswat");
        Transaction t = new Transaction();
        t.issueBook(b, m);
    }
}