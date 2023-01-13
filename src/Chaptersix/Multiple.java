package chapterSix;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the first integer: (input 0 to exist) ");
            int FirstNumber = scanner.nextInt();
            if(FirstNumber==0){
                break;
            }

            System.out.print("Enter the second integer: ");
            int secondNumber = scanner.nextInt();


            if (isMultiple(FirstNumber, secondNumber)) {
                System.out.println(secondNumber + " is a multiple of " + FirstNumber);
            } else {
                System.out.println(secondNumber + " is not a multiple of " + FirstNumber);
            }
        }
    }

    public static boolean isMultiple(int firstNumber, int secondNumber) {
        if (secondNumber % firstNumber == 0) {
            return true;
        }
        return false;
    }
}
