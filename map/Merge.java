package map;

import java.util.*;

public class Merge {
    public static void main(String[] args) {
        Map<String,Integer> m1 = new HashMap<>(Map.of("A",1,"B",2));
        Map<String,Integer> m2 = Map.of("B",3,"C",4);
        m2.forEach((k,v)-> m1.merge(k,v,Integer::sum));
        System.out.println(m1);
    }
}