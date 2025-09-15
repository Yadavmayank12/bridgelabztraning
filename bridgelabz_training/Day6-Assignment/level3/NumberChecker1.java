import java.util.Scanner;

public class NumberChecker1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String s = String.valueOf(num);
        int digits = s.length();
        int[] arr = new int[digits];
        for (int i = 0; i < digits; i++) arr[i] = s.charAt(i) - '0';

        // Duck Number
        boolean duck = false;
        for (int d : arr) if (d == 0) duck = true;
        System.out.println("Duck Number? " + duck);

        // Armstrong Number
        int arm = 0;
        for (int d : arr) arm += Math.pow(d, digits);
        System.out.println("Armstrong? " + (arm == num));

        // Largest and second largest
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int d : arr) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);

        // Smallest and second smallest
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int d : arr) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        System.out.println("Smallest: " + smallest + ", Second Smallest: " + secondSmallest);
    }
}
