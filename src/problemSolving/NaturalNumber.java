package problemSolving;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if its multiple 0f (3 or 5): ");
        int userInput = input.nextInt();
        System.out.println("Sum of all the multiples " + solution(userInput));

    }

    public static int solution(int number) {
        if (number < 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                System.out.println(i);
            }

        }
        return sum;

    }
}
