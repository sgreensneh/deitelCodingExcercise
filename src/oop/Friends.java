package oop;

public class Friends {
    private String name;
    private int[] chances = new int[3];
    private int friendScore;

    public  Friends(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int scores){
        chances[friendScore] = scores;
        friendScore++;
    }
    public  int getTotalScore(){
        int total = 0;
        for (int chance : chances) {
            total += chance;
        }
        return total;
    }
    public  String toString(){
        return String.format("%-15s%-9s%-9s%-9s%-9s", name, chances[0], chances[1],chances[2],getTotalScore());
    }


}
