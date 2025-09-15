import java.util.Scanner;
public class Problem6_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time: ");
        double t = sc.nextDouble();
        System.out.println("Simple Interest: " + (p * r * t) / 100);
        sc.close();
    }
}