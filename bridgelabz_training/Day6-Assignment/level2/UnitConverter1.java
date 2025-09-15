import java.util.Scanner;
public class UnitConverter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println(km + " km = " + miles + " miles");
        
        System.out.print("Enter miles: ");
        miles = sc.nextDouble();
        km = miles * 1.60934;
        System.out.println(miles + " miles = " + km + " km");
        
        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        double feet = meters * 3.28084;
        System.out.println(meters + " meters = " + feet + " feet");
        
        System.out.print("Enter feet: ");
        feet = sc.nextDouble();
        meters = feet * 0.3048;
        System.out.println(feet + " feet = " + meters + " meters");
    }
}