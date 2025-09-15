import java.util.Scanner;
class SplitCompare {
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
    static String[] splitManual(String s) {
        int len = getLength(s);
        int spaceCount = 1;
        for (int i = 0; i < len; i++) if (s.charAt(i) == ' ') spaceCount++;
        String[] words = new String[spaceCount];
        int index = 0;
        String temp = "";
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                words[index++] = temp;
                temp = "";
            } else {
                temp += s.charAt(i);
            }
        }
        words[index] = temp;
        return words;
    }
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] manual = splitManual(text);
        String[] builtin = text.split(" ");
        System.out.println("Comparison: " + compareArrays(manual, builtin));
    }
}