package chapterTwo;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, x2, y1, y2: ");
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int y1 = input.nextInt();
        int y2 = input.nextInt();

        System.out.println(x1 + "" + x2 + "" + y1 + "" + y2);
        System.out.println(isPerpendicular(x1,x2,y1,y2));
    }
    public static boolean isPerpendicular(int x1, int x2, int y1, int y2) {
        boolean onEitherAxis = (x1 == x2 || y1 ==y2);
        boolean lineWithScope = (x1 == x2 && y1 == y2);
        if (onEitherAxis && !lineWithScope ) return true;
        return false;
    }
}
