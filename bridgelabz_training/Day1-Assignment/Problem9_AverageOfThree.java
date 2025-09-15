import java.util.Scanner;
public class Problem9_AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x = sc.nextDouble();
        System.out.print("Enter second number: ");
        double y = sc.nextDouble();
        System.out.print("Enter third number: ");
        double z = sc.nextDouble();
        System.out.println("Average: " + ((x + y + z) / 3));
        sc.close();
    }
}