import java.util.Scanner;
class VowelConsonantCount {
    static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    static int[] countVowelsConsonants(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            String type = charType(s.charAt(i));
            if (type.equals("Vowel")) v++;
            else if (type.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] res = countVowelsConsonants(s);
        System.out.println("Vowels: " + res[0] + " Consonants: " + res[1]);
    }
}