package chapterFour;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (punch 0 to stop): ");
        int userInput = input.nextInt();
        int smallestNumber = userInput;
        int largestNumber = userInput;



        while (userInput != 0) {


            if (userInput > largestNumber) {
                largestNumber = userInput;
            }
            if (userInput < smallestNumber) {
                smallestNumber = userInput;
            }
            System.out.println("Enter another number (punch 0 to stop): ");
            userInput = input.nextInt();

        }
            System.out.println(smallestNumber  +" is smallest number"+ "and " + largestNumber + " largest number");

    }
}




