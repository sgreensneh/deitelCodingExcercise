package chapterFour;


public class Diamond {
    public static void main(String[] args) {

        int blank = 4;
        for (int topTriangle = 1; topTriangle <= 10; topTriangle+=2) {
            for (int space = 0; space < blank ; space++) {
                System.out.print(" ");
            }
            for (int asterisk = 1; asterisk <= topTriangle; asterisk++) {
                System.out.print("*");
            }

            System.out.println();
               blank--;
        }
        blank = 1;
        for (int bottomTriangle = 7; bottomTriangle > 0; bottomTriangle -=2) {
            for (int space = 0; space < blank; space++) {
                System.out.print(" ");
            }
            for (int asterisk = bottomTriangle; asterisk > 0; asterisk--) {
                System.out.print("*");
            }
            System.out.println();
            blank++;
        }
    }
}
