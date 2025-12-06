package map;
import java.util.*;

public class Salary {
    public static void main(String[] args) {
        Map<String,Double> sal=new HashMap<>();
        sal.put("A",50000.0); sal.put("B",60000.0); sal.put("C",55000.0);
        sal.put("A",sal.get("A")*1.1); 
        double avg=sal.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double max=Collections.max(sal.values());
        System.out.println("Avg="+avg);
        sal.forEach((k,v)->{if(v==max)System.out.println("Top="+k);});
    }
}