import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        
        int sum = 0;
        int product = 1;
        int sumOfSquares = 0;
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
            sum += f;
            product *= f;
            sumOfSquares += f * f;
        }
        System.out.println();
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }
}