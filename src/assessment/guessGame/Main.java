package assessment.guessGame;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GuessGame game;
    private static int numberOfPlayer;

    public static void main(String[] args) {
        playGame();
    }

    private static void playGame() {
        registerPlayer();
        startGame();
    }

    private static void startGame() {
        game.generateRandomNumber();
        do {
            try{
                takePlayersGuesses();
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }while (!game.isWon());
    }

    private static void takePlayersGuesses() {
        System.out.printf("%s, it's your turn. Guess a number between 1 and 20%n", game.getCurrentPlayerName());
        int guess = scanner.nextInt();
        System.out.println(game.playGame(guess));
    }

    private static void registerPlayer() {
        registerNumberOfPlayer();
        registerPlayersName();
    }

    private static void registerPlayersName() {
        for (int i = 0; i < numberOfPlayer; i++) {
            System.out.println("Player "+(i + 1)+ ", enter your name.");
            String playerName = scanner.next();
            game.registerPlayer(playerName);
        }
    }

    private static void registerNumberOfPlayer() {
        System.out.println("How many players want to play?");
        numberOfPlayer = scanner.nextInt();
        game = new GuessGame(numberOfPlayer);
    }
}
