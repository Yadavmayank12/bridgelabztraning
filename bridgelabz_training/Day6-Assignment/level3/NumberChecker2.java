import java.util.Scanner;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String s = String.valueOf(num);
        int digits = s.length();
        int[] arr = new int[digits];
        for (int i = 0; i < digits; i++) arr[i] = s.charAt(i) - '0';

        // Sum of digits
        int sum = 0;
        for (int d : arr) sum += d;
        System.out.println("Sum of digits: " + sum);

        // Sum of squares
        int sumSq = 0;
        for (int d : arr) sumSq += Math.pow(d, 2);
        System.out.println("Sum of squares: " + sumSq);

        // Harshad check
        System.out.println("Harshad Number? " + (num % sum == 0));

        // Frequency
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) { freq[i][0] = i; freq[i][1] = 0; }
        for (int d : arr) freq[d][1]++;
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) if (freq[i][1] > 0)
            System.out.println(freq[i][0] + " -> " + freq[i][1]);
    }
}
