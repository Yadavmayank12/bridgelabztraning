package map;
import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Map<String,Double> grades = new TreeMap<>();
        grades.put("Alice",85.0); grades.put("Bob",90.0);
        grades.put("Alice",88.0); // update
        grades.remove("Bob");     // remove
        grades.forEach((k,v)->System.out.println(k+"="+v));
    }
}