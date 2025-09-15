import java.util.Scanner;
public class Problem8_PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exp = sc.nextDouble();
        System.out.println("Power: " + Math.pow(base, exp));
        sc.close();
    }
}