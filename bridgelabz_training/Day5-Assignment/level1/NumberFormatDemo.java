import java.util.Scanner;
class NumberFormatDemo {
    static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }
    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
        handleException(text);
    }
}