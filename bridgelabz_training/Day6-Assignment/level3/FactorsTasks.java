import java.util.Scanner;

public class FactorsTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) factors[idx++] = i;

        int sum = 0, product = 1, cubeProduct = 1, greatest = factors[0];
        for (int f : factors) {
            sum += f;
            product *= f;
            cubeProduct *= Math.pow(f, 3);
            if (f > greatest) greatest = f;
        }

        System.out.println("Factors:");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nGreatest: " + greatest);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Cube Product: " + cubeProduct);
    }
}
