import java.util.Scanner;
public class Problem4_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of circle: " + (3.14159 * r * r));
        sc.close();
    }
}