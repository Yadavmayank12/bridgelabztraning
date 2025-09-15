import java.util.Scanner;
public class UnitConverter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();
        double feet = yards * 3;
        System.out.println(yards + " yards = " + feet + " feet");
        
        System.out.print("Enter feet: ");
        feet = sc.nextDouble();
        yards = feet * 0.333333;
        System.out.println(feet + " feet = " + yards + " yards");
        
        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        double inches = meters * 39.3701;
        System.out.println(meters + " meters = " + inches + " inches");
        
        System.out.print("Enter inches: ");
        inches = sc.nextDouble();
        meters = inches * 0.0254;
        System.out.println(inches + " inches = " + meters + " meters");
        
        System.out.print("Enter inches: ");
        inches = sc.nextDouble();
        double cm = inches * 2.54;
        System.out.println(inches + " inches = " + cm + " cm");
    }
}