import java.util.Scanner;
class VowelConsonantType {
    static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    static String[][] classify(String s) {
        String[][] res = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            res[i][0] = String.valueOf(s.charAt(i));
            res[i][1] = charType(s.charAt(i));
        }
        return res;
    }
    static void display(String[][] data) {
        System.out.println("Char\tType");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] res = classify(s);
        display(res);
    }
}