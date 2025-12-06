package Collections2;
import java.util.*;
public class Subset {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(1,2,3,4));

        boolean isSubset = true;
        for(Integer x : s1) {
            if(!s2.contains(x)) {
                isSubset = false;
                break;
            }
        }
        System.out.println(isSubset);
    }
}