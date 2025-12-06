package Collections;
import java.util.*;
public class Elements{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n = 3;
        int index = list.size() - n;
        System.out.println(list.get(index));
    }
}