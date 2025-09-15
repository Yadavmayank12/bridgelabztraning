import java.util.Scanner;
import java.util.Random;
class VotingEligibility {
    static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = rand.nextInt(90);
        return ages;
    }
    static String[][] checkEligibility(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) res[i][1] = "true";
            else res[i][1] = "false";
        }
        return res;
    }
    static void display(String[][] data) {
        System.out.println("Age\tCanVote");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] ages = generateAges(n);
        String[][] data = checkEligibility(ages);
        display(data);
    }
}