package chapterFour;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                1. 2000
                2. 5000
                3. 10000
                4. 15000
                5. 20000
                """);
        System.out.println("Enter any number listed above: ");
        int UserInput = input.nextInt();
        switch (UserInput) {
            case (1) -> System.out.println("Take your 2k. ");
            case (2) -> System.out.println("Take your 5k. ");
            case (3) -> System.out.println("Take your 10k. ");
            case (6) -> {
                System.out.println("Enter other amount: ");
                String amount = input.next();
                otherAmount(amount);
            }
            default -> System.out.println("Money has finished, try again later. ");
        }
        }
        private static void otherAmount(String amount){
            System.out.println("Take your cash: ");
    }
}
