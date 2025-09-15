import java.util.Scanner;
public class Problem10_KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        System.out.println("Miles: " + (km * 0.621371));
        sc.close();
    }
}