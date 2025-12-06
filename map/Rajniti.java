package map;
import java.util.*;

public class Rajniti {
    public static void main(String[] args) {
        Map<String,Integer> votes = new HashMap<>();
        String[] cast = {"A","B","A","C","B","A","C","B","B","C"};
        for(String c: cast) votes.put(c,votes.getOrDefault(c,0)+1);
        System.out.println(votes);
        String winner = Collections.max(votes.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Winner="+winner);
    }
}