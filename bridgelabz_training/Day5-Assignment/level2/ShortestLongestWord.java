import java.util.Scanner;
class ShortestLongestWord {
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
    static int[] shortestLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitManual(text);
        String[][] data = wordsWithLength(words);
        int[] result = shortestLongest(data);
        System.out.println("Shortest: " + data[result[0]][0]);
        System.out.println("Longest: " + data[result[1]][0]);
    }
}