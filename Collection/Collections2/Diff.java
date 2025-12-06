package Collections2;
import java.util.*;
public class Diff {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5));

        Set<Integer> result = new HashSet<>();
        for(Integer x : s1) {
        	if(!s2.contains(x)) { result.add(x);
        	
        	}
        }
        for(Integer x : s2) {
        	if(!s1.contains(x)) {
        		result.add(x);
        	}
        }

        System.out.println(result);
    }
}