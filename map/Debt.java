package map;
import java.util.*;

class Emp { String name, dept; Emp(String n,String d){name=n;dept=d;} }

public class Debt {
    public static void main(String[] args) {
        List<Emp> list = List.of(new Emp("Alice","HR"), new Emp("Bob","IT"), new Emp("Carol","HR"));
        Map<String,List<String>> map = new HashMap<>();
        for(Emp e: list) map.computeIfAbsent(e.dept,k->new ArrayList<>()).add(e.name);
        System.out.println(map);
    }
}