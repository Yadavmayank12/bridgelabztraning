package map;

import java.util.*;

public class Library {
    public static void main(String[] args) {
        Map<String,String> books = new TreeMap<>();
        books.put("978-1","Java"); books.put("978-2","DSA");
        System.out.println(books.getOrDefault("978-1","Not found"));
        books.remove("978-2");
        books.forEach((k,v)->System.out.println(k+"="+v));
    }
}