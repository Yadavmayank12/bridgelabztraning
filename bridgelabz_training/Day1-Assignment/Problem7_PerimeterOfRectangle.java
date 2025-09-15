import java.util.Scanner;
public class Problem7_PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();
        System.out.println("Perimeter of rectangle: " + (2 * (l + w)));
        sc.close();
    }
}