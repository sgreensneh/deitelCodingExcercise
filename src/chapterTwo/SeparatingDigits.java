package chapterTwo;

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers: ");
        int userInput = input.nextInt();

        while (userInput > 0){
            System.out.println(userInput%10);
            userInput /= 10;

        }


    }
}
