package Collections2;
import java.util.*;
public class Union {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5));

        Set<Integer> union = new HashSet<>();
        for(Integer x : s1) union.add(x);
        for(Integer x : s2) union.add(x);

        Set<Integer> inter = new HashSet<>();
        for(Integer x : s1) {
            if(s2.contains(x)) inter.add(x);
        }

        System.out.println(union);
        System.out.println(inter);
    }
}