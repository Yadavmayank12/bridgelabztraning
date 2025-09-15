import java.util.Random;
import java.util.HashSet;

public class OTPGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        HashSet<String> otps = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int otp = 100000 + rand.nextInt(900000);
            otps.add(String.valueOf(otp));
            System.out.println("OTP " + (i+1) + ": " + otp);
        }

        System.out.println("All OTPs unique? " + (otps.size() == 10));
    }
}
