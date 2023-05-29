package oop;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Archeryy archeryy;
    private static int numberOfPlayer;

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        registerPlayer();
        startGame();
        displayResult();
    }

    public static void registerPlayer() {
        System.out.println("How many player are on board ? ");
        numberOfPlayer = Integer.parseInt(scanner.nextLine());
        archeryy = new Archeryy(numberOfPlayer);
        for (int i = 0; i < numberOfPlayer; i++) {
            System.out.println("yo player " + (i + 1) + " what is your name ?");
            String playName = scanner.nextLine();
            archeryy.registerPlayer(playName);
        }
    }

    public static void startGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < numberOfPlayer; j++) {
                archeryy.generateRandomNumber();
            }
        }
    }

    public static void displayResult() {
        System.out.printf("""
    ===================================================
    %-15s%-9s%-9s%-9s%-9s
    ===================================================
    """, "PlayerName", "Score1", "Score2", "Score3", "Total");

        for (int i = 0; i < numberOfPlayer; i++) {
            System.out.println(archeryy.getScores());
        }

        int maximum = archeryy.maximumScore();
        System.out.printf("%s won the game, having a total  of %s points.", archeryy.getWinner(), maximum);
    }
}
