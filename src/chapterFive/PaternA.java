package chapterFive;

public class PaternA {
    public static void main(String[] args) {
        int blank = 5;
        for (int pattern = 1; pattern <= 6; pattern++) {
            for (int patternloop = 1; patternloop <= pattern; patternloop++) {
                System.out.print(patternloop+ " ");
            }
            System.out.println();


        }
    }
}
