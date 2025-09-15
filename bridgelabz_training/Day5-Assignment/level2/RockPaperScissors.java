import java.util.Scanner;
class RockPaperScissors {
    static String computerChoice() {
        int val = (int)(Math.random()*3);
        if (val==0) return "rock";
        if (val==1) return "paper";
        return "scissors";
    }
    static String winner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if (user.equals("rock") && comp.equals("scissors")) return "user";
        if (user.equals("scissors") && comp.equals("paper")) return "user";
        if (user.equals("paper") && comp.equals("rock")) return "user";
        return "computer";
    }
    static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] res = new String[2][3];
        res[0][0] = "User"; res[1][0] = "Computer";
        res[0][1] = String.valueOf(userWins); res[1][1] = String.valueOf(compWins);
        res[0][2] = String.valueOf((userWins*100.0)/games);
        res[1][2] = String.valueOf((compWins*100.0)/games);
        return res;
    }
    static void displayStats(String[][] data) {
        System.out.println("Player\tWins\tPercentage");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        int userWins = 0, compWins = 0;
        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next();
            String comp = computerChoice();
            String win = winner(user, comp);
            System.out.println("Computer chose: " + comp);
            if (win.equals("user")) userWins++;
            else if (win.equals("computer")) compWins++;
        }
        String[][] stats = calculateStats(userWins, compWins, games);
        displayStats(stats);
    }
}