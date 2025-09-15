import java.util.Scanner;
public class UniqueCharacterFrequency {
    public static char[] uniqueChars(String text) {
        char[] temp = new char[text.length()];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) if (text.charAt(j) == c) isUnique = false;
            if (isUnique) temp[count++] = c;
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) result[i] = temp[i];
        return result;
    }
    public static String[][] frequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        char[] unique = uniqueChars(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = frequency(text);
        for (String[] row : result) System.out.println(row[0] + " -> " + row[1]);
    }
}