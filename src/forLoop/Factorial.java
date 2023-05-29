package forLoop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        int factorial = userInput;
        System.out.print(userInput);
        for ( int i = userInput-1; i > 0; i--) {
            System.out.print(" * "+i);
            factorial *= i;

        }

        System.out.println();
        System.out.println(userInput +" ===> " + factorial);
    }
}
