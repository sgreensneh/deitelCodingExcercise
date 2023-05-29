package practice;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for star patterns: ");
        int userInput = input.nextInt();

        for (int i = 1; i <= userInput; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = userInput-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
