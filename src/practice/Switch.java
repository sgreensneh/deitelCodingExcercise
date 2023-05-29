package practice;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What gender are you ? ");
        String userInput = input.nextLine();

        switch (userInput.toUpperCase()){
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("I am a male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("Prefer not say");
                break;
            default:
                System.out.println("You not a human");
        }
    }
}
