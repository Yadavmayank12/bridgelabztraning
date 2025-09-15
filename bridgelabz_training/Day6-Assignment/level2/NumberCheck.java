import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            if (arr[i] >= 0) {
                System.out.print(arr[i] + " is Positive and ");
                if (arr[i] % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }
        
        if (arr[0] > arr[4]) {
            System.out.println("First number is greater than last");
        } else if (arr[0] < arr[4]) {
            System.out.println("First number is less than last");
        } else {
            System.out.println("First and last numbers are equal");
        }
    }
}