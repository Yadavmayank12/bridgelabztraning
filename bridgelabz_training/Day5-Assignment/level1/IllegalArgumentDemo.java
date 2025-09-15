import java.util.Scanner;
class IllegalArgumentDemo {
    static void generateException(String s) {
        System.out.println(s.substring(3, 1));
    }
    static void handleException(String s) {
        try {
            System.out.println(s.substring(3, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            generateException(s);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
        handleException(s);
    }
}