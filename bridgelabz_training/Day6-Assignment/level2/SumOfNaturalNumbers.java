import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Not a natural number.");
        } else {
            int sumRecursive = sumRecursion(n);
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using recursion: " + sumRecursive);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Both results are equal: " + (sumRecursive == sumFormula));
        }
    }
    
    static int sumRecursion(int n) {
        if (n == 1) return 1;
        return n + sumRecursion(n - 1);
    }
}