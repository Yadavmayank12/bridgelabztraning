package Collections2;
import java.util.*;
public class Equal {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,2,1));
        if(s1.size() == s2.size() && s1.containsAll(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}