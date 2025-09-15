import java.util.Scanner;

public class NumberChecker4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Prime check
        boolean prime = num > 1;
        for (int i = 2; i <= num / 2; i++) if (num % i == 0) prime = false;
        System.out.println("Prime? " + prime);

        // Neon
        int sq = num * num, sum = 0;
        while (sq > 0) { sum += sq % 10; sq /= 10; }
        System.out.println("Neon? " + (sum == num));

        // Spy number
        int n = num, s = 0, p = 1;
        while (n > 0) { int d = n % 10; s += d; p *= d; n /= 10; }
        System.out.println("Spy? " + (s == p));

        // Automorphic
        String strNum = String.valueOf(num);
        String strSq = String.valueOf(num * num);
        System.out.println("Automorphic? " + strSq.endsWith(strNum));

        // Buzz
        System.out.println("Buzz? " + (num % 7 == 0 || num % 10 == 7));
    }
}
