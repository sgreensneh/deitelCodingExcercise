package arrays;

import java.security.SecureRandom;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int randomNumber = random.nextInt(20) + 1;

        while (true){
            System.out.println("Enter a number between (1 - 20) to guess ");
            int guessNumber = scanner.nextInt();

            if (guessNumber == randomNumber) {
                System.out.println("Congratulation!!!  you guessed right.");
                break;
            } else if (randomNumber > guessNumber) {
                System.out.println("Nope!!! number too high. Guess again.");
            }
            else {
                System.out.println("Nope!!! number too low. Guess again.");
            }


        }


    }
}