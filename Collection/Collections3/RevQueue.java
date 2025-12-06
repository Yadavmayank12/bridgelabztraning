package Collections3;
import java.util.*;
public class RevQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30));
        List<Integer> temp = new ArrayList<>();
        while(!q.isEmpty()) {
            temp.add(q.remove());
        }
        for(int i=temp.size()-1; i>=0; i--) {
            q.add(temp.get(i));
        }
        System.out.println("Original Queue"+temp);
        System.out.println("Reversed Queue"+q);
    }
}