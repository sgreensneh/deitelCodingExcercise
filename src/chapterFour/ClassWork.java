package chapterFour;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("""
//                1. Goalkeeper
//                2. Defender
//                3. Defender
//                4. Defender
//                5. Defender
//                6. Midfielder
//                7. Midfielder
//                8. Midfielder
//                9. Attacker
//                10.Attacker
//                11.Attacker
//
//
//                """);
        System.out.println("Enter any number from the list: ");
        int userInput = input.nextInt();

        switch (userInput) {
            case (1) -> System.out.println("You entered Goalkeeper: ");
            case (2) -> System.out.println("You entered Defender: ");
            case (3) -> System.out.println("You entered Defender: ");
            case (4) -> System.out.println("You entered Defender: ");
            case (5) -> System.out.println("You entered Defender: ");
            case (6) -> System.out.println("You entered Midfielder: ");
            case (7) -> System.out.println("You entered Midfielder: ");
            case (8) -> System.out.println("You entered Midfielder: ");
            case (9) -> System.out.println("You entered Attacker: ");
            case (10) -> System.out.println("You entered Attacker: ");
            case (11) -> System.out.println("You entered Attacker: ");
            default -> System.out.println("You not a good thinker: ");
        }


    }
}
