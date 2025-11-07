package src;

import java.util.*;

class Invoiceg {
    String id;
    Invoiceg(String id) { this.id = id; }
    public String toString() { return "Invoice for " + id; }
}

 class Invoice {
    public static void main(String[] args) {
        List<String> txns = Arrays.asList("TX100", "TX101", "TX102");
        List<Invoiceg> invoices = txns.stream()
                                     .map(Invoiceg::new)
                                     .toList();
        invoices.forEach(System.out::println);
    }
}