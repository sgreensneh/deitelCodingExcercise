package assessments;

import java.util.Scanner;

public class guessDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int date = 22;
        while (true){
            System.out.println("guess my birth date");
            int userInput = scanner.nextInt();

            if(userInput == date){
                System.out.println("you guessed right");
                break;
            } else if (date > userInput) {
                System.out.println("number too high, try again");

            } else {
                System.out.println("number too low, you can do better");
            }
        }
    }
}
