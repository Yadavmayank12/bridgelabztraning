package Collections;
import java.util.*;
class ReverseList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for(int i=0,j=arrayList.size()-1;i<j;i++,j--){
            int temp=arrayList.get(i);
            arrayList.set(i,arrayList.get(j));
            arrayList.set(j,temp);
        }
        System.out.println(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        for(int i=0,j=linkedList.size()-1;i<j;i++,j--){
            int temp=linkedList.get(i);
            linkedList.set(i,linkedList.get(j));
            linkedList.set(j,temp);
        }
        System.out.println(linkedList);
    }
}