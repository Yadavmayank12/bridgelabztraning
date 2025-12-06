package Collections3;
class CircularBufferSimple {
    int[] buffer; int size; int index=0; boolean full=false;
    CircularBufferSimple(int s){ size=s; buffer=new int[s]; }
    void insert(int x){
        buffer[index] = x;
        index = (index+1)%size;
        if(index==0) full=true;
    }
    void display(){
        int count = full ? size : index;
        for(int i=0; i<count; i++) {
            System.out.print(buffer[i]+" ");
        }
    }
    public class Buffer{
    	public static void main(String[] args) {
    
        CircularBufferSimple cb = new CircularBufferSimple(3);
        cb.insert(1); cb.insert(2); cb.insert(3); cb.insert(4);
        cb.display();
        }
    }
 }