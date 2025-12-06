package map;

import java.util.*;

public class Key {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("A",10,"B",20,"C",55);
        String max = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(max);
    }
}