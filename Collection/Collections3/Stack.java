package Collections3;
import java.util.*;
class StackSimple {
    Queue<Integer> q = new LinkedList<>();
    void push(int x){ q.add(x); }
    int pop(){
        int size = q.size();
        for(int i=0; i<size-1; i++) {
            q.add(q.remove());
        }
        return q.remove();
    }
    public class Stack{
    public static void main(String[] args) {
        StackSimple s = new StackSimple();
        s.push(1); s.push(2); s.push(3);
        System.out.println(s.pop());
    }
}
}