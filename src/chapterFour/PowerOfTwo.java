package chapterFour;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        double fraction =0;
        for (double count = 1; count <= userInput; count++) {
            fraction += (1/count);
        }
        System.out.println(fraction);
    }
}
