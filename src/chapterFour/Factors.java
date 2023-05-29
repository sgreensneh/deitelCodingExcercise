package chapterFour;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
        int factor = 1;

        while (factor <= userInput) {

            if (userInput % factor == 0) {
                System.out.println(factor);
            }
                factor++;
        }

    }
}
