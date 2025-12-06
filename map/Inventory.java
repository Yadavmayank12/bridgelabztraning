package map;
import java.util.*;

public class Inventory {
    public static void main(String[] args) {
        Map<String,Integer> stock = new HashMap<>();
        stock.put("Apple",10); stock.put("Banana",5);
        stock.put("Apple", stock.get("Apple")-3);
        stock.put("Banana",0); 
        stock.put("Apple", stock.get("Apple")+20);
        stock.forEach((k,v)->System.out.println(k+"="+v));
    }
}
