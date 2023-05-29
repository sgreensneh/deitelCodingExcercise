package oop;

import java.security.SecureRandom;

public class Archeryy {
    private Friends[] friends;
    private int numberOfFriends;
    private  int currentPlayer;
    private  String winner;

    public Archeryy(int numberOfFriends){
        this.numberOfFriends = numberOfFriends;
        friends = new Friends[numberOfFriends];
    }
    public  void validateCurrentPlayer(){
        currentPlayer++;
        if(currentPlayer > numberOfFriends-1) currentPlayer = 0;
    }

    public  void  registerPlayer(String playerName){
        friends[currentPlayer] = new Friends(playerName);
        validateCurrentPlayer();
    }
    public  void  generateRandomNumber(){
        SecureRandom random = new SecureRandom();
        friends[currentPlayer].setScore(random.nextInt(11));
        validateCurrentPlayer();
    }

  public String getScores(){
        String playerScore = friends[currentPlayer].toString();
        validateCurrentPlayer();
        return playerScore;
    }

    public int maximumScore(){
        int highestScore = Integer.MIN_VALUE;
        for (int i = 0; i < friends.length; i++) {
            Friends friend = friends[i];
            int total = friend.getTotalScore();
            if (total > highestScore) {
                highestScore = total;
                winner = friend.getName();
            }
            validateCurrentPlayer();
        }
        return highestScore;
    }
    public String getWinner(){
        return winner;
    }

}
