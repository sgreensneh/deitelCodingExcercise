package chapterFour;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        for (int counter = userInput-1;counter>=1; counter--){
        System.out.println(("counter"+counter));
        System.out.println((userInput + "*" + counter));
        userInput = userInput * counter;
        System.out.println((userInput));

        }


    }
}
