package chapterFour;

import java.util.Scanner;

public class AverageAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        String text;
        int counter;
        for (counter = 1; counter <= 10; counter++) {

           switch (counter) {
               case 1 -> text = "st";
                case 2 -> text = "nd";
                case 3 -> text = "rd";
                default -> text = "th";
           }
            System.out.println("Enter " + counter + text + " grade");
            int userInput = input.nextInt();

            while (userInput < 0 || userInput > 100) {
                System.out.println("invalid grade: please enter a valid grade: ");
                userInput = input.nextInt();
            }
            sum = sum + userInput;
        }
        int average = sum / 10;
        System.out.println("The average of the students grades is: " + average);

    }
}
