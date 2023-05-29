package chapterFour;

import java.util.Scanner;

public class Fourteen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();

        int count = 1;
        while (count <= 12) {

        int product = userInput * count;
        System.out.println(userInput + " times " + count + " is " + product );
            count++;
        }
    }

}
