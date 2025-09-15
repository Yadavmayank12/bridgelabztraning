import java.util.Scanner;
public class Problem5_VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        double r = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double h = sc.nextDouble();
        System.out.println("Volume of cylinder: " + (3.14159 * r * r * h));
        sc.close();
    }
}