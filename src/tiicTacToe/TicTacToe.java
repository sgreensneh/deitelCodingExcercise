package tiicTacToe;

import static tiicTacToe.Symbols.O;
import static tiicTacToe.Symbols.X;

public class TicTacToe {
    private Player[] players;
    private String[][] board = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
    };
    private int currentPlayerIndex;
    private int numberOfPlayers;
    private boolean isWon;

    public TicTacToe(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        players = new Player[numberOfPlayers];
    }

    public void registerPlayer(String playerName) {
        players[currentPlayerIndex] = new Player(playerName);
        if (currentPlayerIndex == 0) players[currentPlayerIndex].setSymbols(X);
        if (currentPlayerIndex == 1) players[currentPlayerIndex].setSymbols(O);
        resetCurrentPlayerIndex();
    }
    private void resetCurrentPlayerIndex() {
        currentPlayerIndex++;
        if (currentPlayerIndex > numberOfPlayers - 1) currentPlayerIndex = 0;
    }

    public void playGame(int position) {
        setPosition(position);
        checkWinning();
        resetCurrentPlayerIndex();
    }

    private void checkWinning() {
        row1();
        row2();
        row3();
        row4();
        row5();
        row6();
        row7();
        row8();

    }

    private void row8() {

        String column22 = board[0][0];
        String column23 = board[1][1];
        String column24 = board[2][2];
        validateWinning(column22, column23, column24);
    }

    private void row7() {
        String column19 = board[0][2];
        String column20 = board[1][1];
        String column21 = board[2][0];
        validateWinning(column19, column20, column21);
    }

    private void row6() {

        String column16 = board[0][2];
        String column17 = board[1][2];
        String column18 = board[2][2];
        validateWinning(column16, column17, column18);
    }

    private void row5() {
        String column13 = board[0][1];
        String column14 = board[1][1];
        String column15 = board[2][1];
        validateWinning(column13, column14, column15);
    }

    private void row4() {
        String column10 = board[0][0];
        String column11 = board[1][0];
        String column12 = board[2][0];
        validateWinning(column10, column11, column12);
    }

    private void validateWinning(String column1, String column2, String column3) {
        if (!column1.equals(" ") && !column2.equals(" ") && !column3.equals(" ")) {
            if (column1.equals(column2) && column2.equals(column3)) {
                isWon = true;
                currentPlayerIndex--;
            }
        }
    }

    private void row3() {
        String column7 = board[2][0];
        String column8 = board[2][1];
        String column9 = board[2][2];
        validateWinning(column7, column8, column9);
    }

    private void row2() {
        String column4 = board[1][0];
        String column5 = board[1][1];
        String column6 = board[1][2];
        validateWinning(column4, column5, column6);
    }

    private void row1() {
        validateWinning2("00", "01", "02");
    }

    private void validateWinning2(String firstCoordinate, String secondCoordinate, String thirdCoordinate) {
        String column1 = board[getIntValue(firstCoordinate, 0)][getIntValue(firstCoordinate,1)];
        String column2 = board[getIntValue(secondCoordinate, 0)][getIntValue(secondCoordinate, 1)];
        String column3 = board[getIntValue(thirdCoordinate, 0)][getIntValue(thirdCoordinate, 1)];
        validateWinning(column1, column2, column3);
    }

    private int getIntValue(String coordinate, int index) {
        return Integer.parseInt(String.valueOf(coordinate.charAt(index)));
    }

    private void setPosition(int position) {
        switch (position) {
            case 1 -> setColumn(0, 0);
            case 2 -> setColumn(0, 1);
            case 3 -> setColumn(0, 2);
            case 4 -> setColumn(1, 0);
            case 5 -> setColumn(1, 1);
            case 6 -> setColumn(1, 2);
            case 7 -> setColumn(2, 0);
            case 8 -> setColumn(2, 1);
            case 9 -> setColumn(2, 2);
        }
    }

    private void setColumn(int row, int column) {
        if (!board[row][column].equals(" ")) throw new IllegalArgumentException("Position already taken");
        board[row][column] = players[currentPlayerIndex].getSymbols().name();
    }

    public String[][] getBoard() {
        return board;
    }

    public String getCurrentPlayerName() {
        return players[currentPlayerIndex].getName();
    }

    public boolean isWon() {
        return isWon;
    }
}