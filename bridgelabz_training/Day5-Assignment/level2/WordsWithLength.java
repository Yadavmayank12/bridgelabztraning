import java.util.Scanner;
class WordsWithLength {
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
    static String[][] wordsWithLength(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(getLength(words[i]));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitManual(text);
        String[][] result = wordsWithLength(words);
        System.out.println("Word	Length");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
        }
    }
}