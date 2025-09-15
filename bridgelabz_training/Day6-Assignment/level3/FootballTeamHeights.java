import java.util.Random;

public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        int sum = 0;
        int shortest = Integer.MAX_VALUE;
        int tallest = Integer.MIN_VALUE;

        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101);
            sum += heights[i];
            if (heights[i] < shortest) shortest = heights[i];
            if (heights[i] > tallest) tallest = heights[i];
        }

        double mean = (double) sum / heights.length;

        System.out.println("Player Heights:");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest: " + shortest);
        System.out.println("Tallest: " + tallest);
        System.out.println("Mean Height: " + mean);
    }
}
