package src;

import java.util.*;
import java.util.stream.*;

public class Employes{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rajesh", "Deepak", "Shubhi");
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}