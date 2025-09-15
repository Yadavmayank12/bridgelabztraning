import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String s = String.valueOf(num);
        int digits = s.length();
        int[] arr = new int[digits];
        for (int i = 0; i < digits; i++) arr[i] = s.charAt(i) - '0';

        // Reverse array
        int[] rev = new int[digits];
        for (int i = 0; i < digits; i++) rev[i] = arr[digits - 1 - i];

        // Compare
        boolean equal = Arrays.equals(arr, rev);
        System.out.println("Palindrome? " + equal);

        // Duck check
        boolean duck = false;
        for (int d : arr) if (d == 0) duck = true;
        System.out.println("Duck? " + duck);
    }
}
