import java.util.Scanner;
class TrimSpaces {
    static int[] findBounds(String s) {
        int start = 0, end = s.length()-1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return new int[]{start, end+1};
    }
    static String substringManual(String s, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) sub += s.charAt(i);
        return sub;
    }
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] bounds = findBounds(s);
        String manual = substringManual(s, bounds[0], bounds[1]);
        String builtin = s.trim();
        System.out.println("Comparison: " + compareStrings(manual, builtin));
    }
}