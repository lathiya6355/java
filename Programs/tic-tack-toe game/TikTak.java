import java.util.Scanner;

public class TikTak {
    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        boolean isPlayer1 = true;
        boolean gameEnded = false;
        int moves = 0;

        while (!gameEnded) {
            printBoard(board);

            int[] move = getInput(isPlayer1);

            if (board[move[0]][move[1]] == ' ') {
                board[move[0]][move[1]] = isPlayer1 ? 'X' : 'O';
                moves++;
                
                if (hasWon(board, move[0], move[1])) {
                    gameEnded = true;
                    System.out.println("Player " + (isPlayer1 ? "1" : "2") + " wins!");
                } else if (moves == 9) {
                    gameEnded = true;
                    System.out.println("It's a draw!");
                }

                isPlayer1 = !isPlayer1;
            } else {
                System.out.println("That cell is already taken! Try again.");
            }
        }

        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " | ");
            }
            System.out.println();
            System.out.println("----------");
        }
    }

    public static int[] getInput(boolean isPlayer1) {
        Scanner scanner = new Scanner(System.in);
        int[] move = new int[2];

        int player = isPlayer1 ? 1 : 2;
        System.out.println("Player " + player + ", enter your move (row[1-3] column[1-3]): ");

        move[0] = scanner.nextInt() - 1;
        move[1] = scanner.nextInt() - 1;

        return move;
    }

    public static boolean hasWon(char[][] board, int row, int col) {
        // Check row
        if (board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
            return true;
        }

        // Check column
        if (board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
            return true;
        }

        // Check diagonals
        if (row == col || row + col == 2) {
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
                return true;
            }
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                return true;
            }
        }

        return false;
    }
}
