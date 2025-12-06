import static java.lang.Math.*;
public class StaticImportDemo {
    public static void main(String[] args) {
        double a = sqrt(25);
        double b = pow(2, 3);
        double c = max(10, 20);
        double d = min(5, -5);
        double e = abs(-9);
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
    }
}