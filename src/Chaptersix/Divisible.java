package chapterSix;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++){
            System.out.println("Enter an integer: ");
            int userInput = input.nextInt();

            if(isDivisible(userInput)){
                System.out.println(userInput + " is divisible by 5");
            }
            else {
                System.out.println(userInput + " is not divisible by 5");
            }


        }


    }
    public static boolean isDivisible(int divisible){
        if(divisible % 5 == 0){
            return true;
        }
        else {
            return false;
        }

    }
}
