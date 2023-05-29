package chapterTwo;

public class TableOfSquareAdCubes {
    public static void main(String[] args) {
        System.out.println("Number\t\tSquare\t\tCube");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i+"\t\t\t"+ (int)Math.pow(i,2) + "\t\t\t"+ (int)Math.pow(i,3));

        }


    }
}
