package forLoop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(userInput+ " * "+ i +" = " +userInput*i);



        }
    }
}
