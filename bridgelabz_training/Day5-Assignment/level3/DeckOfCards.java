import java.util.Scanner;
public class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) for (String rank : ranks) deck[index++] = rank + " of " + suit;
        return deck;
    }
    public static String[] shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
    public static String[][] distribute(String[] deck, int n, int players) {
        if (n % players != 0) return new String[0][0];
        int cardsPerPlayer = n / players;
        String[][] result = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) result[i][j] = deck[index++];
        }
        return result;
    }
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) System.out.print(card + ", ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int players = sc.nextInt();
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        String[][] distributed = distribute(deck, n, players);
        printPlayers(distributed);
    }
}