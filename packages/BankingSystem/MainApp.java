import com.bank.util.InterestCalculator;
public class MainApp {
    public static void main(String[] args) {
        InterestCalculator ic = new InterestCalculator();
        System.out.println("SI: " + ic.calculateSimpleInterest(10000, 5, 2));
        System.out.println("CI: " + ic.calculateCompoundInterest(10000, 5, 2));
    }
}