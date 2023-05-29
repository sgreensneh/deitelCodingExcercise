package practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();
        int originalNumber = userInput;
        int revNumber = 0;

        while (userInput > 0){
            revNumber = revNumber * 10 + userInput%10;
            userInput = userInput/10;
        }
        if(originalNumber == revNumber){
            System.out.println(originalNumber +" is a palindrome number");
        }else {
            System.out.println(originalNumber+ " is not a palindrome number");
        }
    }

}
