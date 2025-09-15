import java.util.Scanner;
class SubstringCompare {
    static String substringByCharAt(String s, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) sub += s.charAt(i);
        return sub;
    }
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String userSub = substringByCharAt(s, start, end);
        String builtInSub = s.substring(start, end);
        System.out.println("User-defined substring: " + userSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Comparison: " + compareStrings(userSub, builtInSub));
    }
}