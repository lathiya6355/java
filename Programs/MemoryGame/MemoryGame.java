import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MemoryGame {
    private final String[] symbols = {"A", "B", "C", "D", "E", "F", "G", "H", "A", "B", "C", "D", "E", "F", "G", "H"};
    private String[] tiles;
    private boolean[] flipped;
    private int pairsFound;

    public MemoryGame() {
        tiles = new String[symbols.length];
        flipped = new boolean[symbols.length];
        pairsFound = 0;

        List<String> symbolsList = Arrays.asList(symbols);
        Collections.shuffle(symbolsList);
        symbolsList.toArray(tiles);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (pairsFound < symbols.length / 2) {
            displayBoard();
            System.out.println("Enter two positions to flip (e.g., 0 1):");
            int position1 = scanner.nextInt();
            int position2 = scanner.nextInt();

            if (position1 < 0 || position1 >= symbols.length || position2 < 0 || position2 >= symbols.length ||
                position1 == position2 || flipped[position1] || flipped[position2]) {
                System.out.println("Invalid positions. Try again.");
                continue;
            }

            if (tiles[position1].equals(tiles[position2])) {
                System.out.println("Match found!");
                flipped[position1] = true;
                flipped[position2] = true;
                pairsFound++;
            } else {
                System.out.println("No match. Try again.");
            }
        }
        System.out.println("Congratulations! You found all the pairs.");
    }

    public void displayBoard() {
        System.out.println("Memory Game Board:");
        for (int i = 0; i < symbols.length; i++) {
            if (flipped[i]) {
                System.out.print("[" + tiles[i] + "] ");
            } else {
                System.out.print("[ ] ");
            }
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        MemoryGame game = new MemoryGame();
        game.play();
    }
}

