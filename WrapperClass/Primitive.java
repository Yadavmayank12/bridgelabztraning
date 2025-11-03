package src;


public class Primitive {
    public static void main(String[] args) {
        Double obj = Double.valueOf(45.67);

        double d = obj.doubleValue(); 
        int i = (int) d;
        System.out.println("Double object: " + obj);
        System.out.println("Primitive double: " + d);
        System.out.println("Primitive int (casted): " + i);
    }
}