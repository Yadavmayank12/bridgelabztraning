import java.util.Scanner;
public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt(), height1 = sc.nextInt();
        int age2 = sc.nextInt(), height2 = sc.nextInt();
        int age3 = sc.nextInt(), height3 = sc.nextInt();
        if (age1 < age2 && age1 < age3) System.out.println("Amar is Youngest");
        else if (age2 < age1 && age2 < age3) System.out.println("Akbar is Youngest");
        else System.out.println("Anthony is Youngest");
        if (height1 > height2 && height1 > height3) System.out.println("Amar is Tallest");
        else if (height2 > height1 && height2 > height3) System.out.println("Akbar is Tallest");
        else System.out.println("Anthony is Tallest");
    }
}