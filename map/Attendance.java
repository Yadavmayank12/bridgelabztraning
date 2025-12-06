package map;
import java.util.*;

public class Attendance {
    public static void main(String[] args) {
        Map<String,Integer> c=new HashMap<>();
        c.put("CS101",45); c.put("CS102",3); c.put("CS103",50);
        c.put("CS101",c.get("CS101")+5); 
        c.put("CS102",Math.max(0,c.get("CS102")-1)); 
        c.forEach((k,v)->System.out.println(k+"="+v));
    }
}