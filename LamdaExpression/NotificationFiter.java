package src;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFiter {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList("Emergency", "Check-up", "Promo", "Medicine Time");

        Predicate<String> isImportant = a -> !a.equals("Promo");

        alerts.stream()
              .filter(isImportant)
              .forEach(a -> System.out.println("Alert: " + a));
    }
}