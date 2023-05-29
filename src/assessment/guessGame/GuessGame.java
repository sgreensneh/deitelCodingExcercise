package assessment.guessGame;

import java.security.SecureRandom;

public class GuessGame {

    private final Player [] players;
    private int currentPlayerIndex;
    private int luckyNumber;
    private boolean isWon;
    private int numberOfPlayer;

    public GuessGame(int numberOfPlayer){
        this.numberOfPlayer = numberOfPlayer;
        players = new Player[numberOfPlayer];
    }

    public void registerPlayer(String playerName){
        players[currentPlayerIndex] = new Player(playerName);
        resetCurrentPlayerIndex();
    }

    private void resetCurrentPlayerIndex() {
        currentPlayerIndex++;
        if (currentPlayerIndex > numberOfPlayer - 1) currentPlayerIndex = 0;
    }

    public void generateRandomNumber(){
        SecureRandom random = new SecureRandom();
        luckyNumber = 1 + random.nextInt(20);
    }

    public String playGame(int guess){
        validate(guess);
        String message = checkWinning(guess);
        resetCurrentPlayerIndex();
        return message;
    }

    private String checkWinning(int guess) {
        if (guess > luckyNumber) return "Guessed number is too high";
        else if (guess < luckyNumber) return  "Guessed number is too low";
        else {
            isWon = true;
            return String.format("Congratulations %s, you won!", players[currentPlayerIndex].getName());
        }
    }

    private void validate(int guess) {
        boolean guessedNumberIsNotValid = guess > 20 || guess < 0;
        if (guessedNumberIsNotValid) {
            throw new IllegalArgumentException("Guess must be between 1 and 20");
        }
    }
    public boolean isWon(){
        return isWon;
    }

    public String getCurrentPlayerName() {
        return players[currentPlayerIndex].getName();
    }
}
