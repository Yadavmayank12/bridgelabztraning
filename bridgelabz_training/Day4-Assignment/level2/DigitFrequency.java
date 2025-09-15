import java.util.Scanner;
class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        String s = Integer.toString(num);
        int[] digits = new int[s.length()];
        int[] freq = new int[10];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
            freq[digits[i]]++;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println("Digit " + i + ": " + freq[i]);
        }
    }
}