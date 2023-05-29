package chapterFour;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        int count = 0, number = 2;


        while (number <= userInput / 2) {
            if (userInput % number == 0) {
                count++;
                break;
            }
            number++;

        }
        if (number==0){
            System.out.println(number + " is a prime number");
        }else {
            System.out.println(number + " is not a prime number");
        }


    }
}




