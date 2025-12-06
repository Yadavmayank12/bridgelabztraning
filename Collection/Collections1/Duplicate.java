package Collections;
import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,1,2,2,3,4);
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<list.size(); i++) {
            if(!result.contains(list.get(i))) {
                result.add(list.get(i));
            }
        }
        System.out.println(result);
    }
}