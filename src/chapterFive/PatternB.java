package chapterFive;

public class PatternB {
    public static void main(String[] args) {
        int blank = 1;
        for (int pattern = 6; pattern > 0; pattern-=1) {
            for (int patternloop = pattern; patternloop > 0; patternloop--) {
                System.out.print(patternloop+ " ");
            }
            System.out.println();


        }
    }
}
