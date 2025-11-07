package src;

import java.util.*;

class Product {
    String name; double price; int rating;
    Product(String n, double p, int r) { name=n; price=p; rating=r; }
    public String toString(){ return name+" "+price+" "+rating; }
}

 class ECommerceSort {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
            new Product("Phone", 800, 5),
            new Product("Laptop", 1200, 4),
            new Product("Watch", 200, 3)
        );

        list.sort((a,b)->Double.compare(a.price,b.price));
        System.out.println("By Price: " + list);

    
        list.sort((a,b)->b.rating - a.rating);
        System.out.println("By Rating: " + list);
    }
}