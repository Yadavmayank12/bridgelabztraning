package src;

import java.util.Scanner;

public class CONVERT {
    public static void main(String[] args) {
        Scanner os = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = os.nextInt();

    
        Integer obj = Integer.valueOf(num);

        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object value: " + obj);
    }
}