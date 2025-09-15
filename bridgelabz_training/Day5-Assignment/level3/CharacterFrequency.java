import java.util.Scanner;
public class CharacterFrequency {
    public static String[][] frequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        int count = 0;
        for (int i = 0; i < text.length(); i++) if (freq[text.charAt(i)] > 0) count++;
        String[][] result = new String[count][2];
        int index = 0;
        boolean[] visited = new boolean[256];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!visited[c]) {
                visited[c] = true;
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                index++;
            }
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