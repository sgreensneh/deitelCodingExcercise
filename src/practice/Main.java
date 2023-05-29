package practice;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name ? ");
        String userInput = input.nextLine();
        System.out.println("Hello " + userInput);

        System.out.println("How old are you ?");
        int age = input.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " +year);
    }
}
