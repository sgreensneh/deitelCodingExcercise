package tiicTacToe;

import java.util.Arrays;
import java.util.Scanner;

import static tiicTacToe.Symbols.X;

public class Main {
    private static Symbols symbols;
    private static Scanner scanner = new Scanner(System.in);
    private static int numberOfPlayers = 2;
    private static TicTacToe ticTacToe = new TicTacToe(numberOfPlayers);

    public static void main(String[] args) {
        registerPlayer();
        displayBoard();
        do {
            trackBoardMoves();
            displayBoard();
        }while (ticTacToe.isWon() == false);

        System.out.printf("%s congratulation!!! you won",ticTacToe.getCurrentPlayerName());
    }

    private static void trackBoardMoves() {
        System.out.printf("%s its your turn to play \n", ticTacToe.getCurrentPlayerName());
        System.out.println("Enter a number (1 - 9)");
        int userInput = scanner.nextInt();
        try{
            ticTacToe.playGame(userInput);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void displayBoard() {
        for (String[] row : ticTacToe.getBoard()) {
            System.out.println(Arrays.toString(row));
        }
    }
    private static void registerPlayer() {
        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.println("player " + i + " enter your name");
            String playerName = scanner.nextLine();
            ticTacToe.registerPlayer(playerName);
            System.out.println();
        }
    }
}
