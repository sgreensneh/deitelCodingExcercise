package archerry;

public class Friend {
    private String name;
    private final int[] chances = new int[3];
    private int scoreIndex;



   public Friend(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score){
       chances[scoreIndex] = score;
       scoreIndex++;
    }

    public String toString(){
       return String.format("%-15s%-9s%-9s%-9s%-9s", name, chances[0], chances[1], chances[2], getTotal());
    }

    public int getTotal() {
       int total = 0;
        for (int chance : chances) {
            total += chance;
        }
        return total;
    }
}
