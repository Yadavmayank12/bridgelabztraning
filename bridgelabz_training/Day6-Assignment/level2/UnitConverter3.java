import java.util.Scanner;
public class UnitConverter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println(f + " F = " + c + " C");
        
        System.out.print("Enter Celsius: ");
        c = sc.nextDouble();
        f = (c * 9 / 5) + 32;
        System.out.println(c + " C = " + f + " F");
        
        System.out.print("Enter pounds: ");
        double pounds = sc.nextDouble();
        double kg = pounds * 0.453592;
        System.out.println(pounds + " pounds = " + kg + " kg");
        
        System.out.print("Enter kilograms: ");
        kg = sc.nextDouble();
        pounds = kg * 2.20462;
        System.out.println(kg + " kg = " + pounds + " pounds");
        
        System.out.print("Enter gallons: ");
        double gallons = sc.nextDouble();
        double liters = gallons * 3.78541;
        System.out.println(gallons + " gallons = " + liters + " liters");
        
        System.out.print("Enter liters: ");
        liters = sc.nextDouble();
        gallons = liters * 0.264172;
        System.out.println(liters + " liters = " + gallons + " gallons");
    }
}