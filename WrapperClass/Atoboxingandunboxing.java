package src;


import java.util.ArrayList;

public class Atoboxingandunboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

   
        for (int i = 10; i <= 50; i += 10) {
            list.add(i);
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        System.out.println("Sum of numbers = " + sum);
    }
}
