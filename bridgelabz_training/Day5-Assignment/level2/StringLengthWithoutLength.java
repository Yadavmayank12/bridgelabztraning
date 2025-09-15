import java.util.Scanner;
class StringLengthWithoutLength {
    static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("User-defined length: " + getLength(s));
        System.out.println("Built-in length: " + s.length());
    }
}