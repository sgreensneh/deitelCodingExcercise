package archerry;

import java.security.SecureRandom;

public class ArcheryGame {
    private final Friend[] friends;
    private int currentPlayerIndex;
    private int numberOfFriend;
    private String winner;

    public ArcheryGame(int numberOfPlayer){
        this.numberOfFriend = numberOfPlayer;
         friends = new Friend[numberOfPlayer];
    }

   public void  resetCurrentPlayerIndex(){
        currentPlayerIndex++;
        if(currentPlayerIndex > numberOfFriend -1) currentPlayerIndex = 0;
    }

   public void generateRandomScores(){
        SecureRandom random = new SecureRandom();
        friends[currentPlayerIndex].setScore(random.nextInt(11));
        resetCurrentPlayerIndex();
    }

    public void registerFriendToPlayTheGame(String playerName) {
        friends[currentPlayerIndex] = new Friend(playerName);
        resetCurrentPlayerIndex();
    }

    public String getFriendScore(){
        String playerScores = friends[currentPlayerIndex].toString();
        resetCurrentPlayerIndex();
        return playerScores;
    }

    public int maximumScore(){
        int highestScore = Integer.MIN_VALUE;
        for (Friend friend : friends) {
            int total = friend.getTotal();
            if (total > highestScore) {
                highestScore = total;
                winner = friend.getName();
            }
            resetCurrentPlayerIndex();
        }

        return highestScore;
    }

    public String getWinner(){
        return winner;
    }
}


