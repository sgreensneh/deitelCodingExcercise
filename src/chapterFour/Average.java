package chapterFour;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int counter;
        for (counter = 1; counter <= 10; counter++) {
            System.out.println("Enter your grade " +counter);
            int userInput = input.nextInt();
            while (userInput < 0 || userInput > 100) {

                System.out.println("invalid grade: please enter a valid grade: ");
                userInput = input.nextInt();

            }
            sum = sum + userInput;
        }
        int average = sum/counter;
        System.out.println("The average of the students grades is: " +average);

    }
}
