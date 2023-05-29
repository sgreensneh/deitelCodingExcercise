package archerry;

import java.util.Scanner;

public class Main {

   private static Scanner input = new Scanner(System.in);
   private static ArcheryGame game;
   private static int numberOfPlayer;
   
    public static void main(String[] args) {
        playGame();
    }

    private static  void  playGame(){
        registerFriend();
        startGame();
        displayResult();
    }

    private static void displayResult() {
        printHeadings();
        result();
        winner();
    }

    private static void winner() {
        int maximumScore = game.maximumScore();
        System.out.printf("The winner is %s, having total score of %s", game.getWinner(), maximumScore);
    }

    private static void result() {
        for (int i = 0; i < numberOfPlayer; i++) {
            System.out.println(game.getFriendScore());
        }
    }

    private static void printHeadings() {
        System.out.printf("""
    ===================================================
    %-15s%-9s%-9s%-9s%-9s
    ===================================================
    """,
                "Player Name", "Score1", "Score2", "Score3", "Total");
    }

    private static void startGame(){
        for (int chance = 0; chance < 3; chance++) {
            for (int j = 0; j < numberOfPlayer; j++) {
                game.generateRandomScores();
            }
        }
    }

    private static void registerFriend() {
        registerNumberOfPlayer();
        registerPlayerName();
    }

    private static void registerNumberOfPlayer() {
        System.out.println("How many players want to play the game?");
        numberOfPlayer = Integer.parseInt(input.nextLine());
        game = new ArcheryGame(numberOfPlayer);
    }

    private static void registerPlayerName() {
        for (int i = 0; i < numberOfPlayer; i++) {
            System.out.println("Player "+(i+1)+", enter your name.");
            String playerName = input.nextLine();
            game.registerFriendToPlayTheGame(playerName);
        }

    }

}
