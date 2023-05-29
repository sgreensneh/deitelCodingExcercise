package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five integers to check largest and smallest number: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        int fourthNumber = input.nextInt();
        int fifthNumber = input.nextInt();

        int smallestNumber = firstNumber;
        int largestNumber = firstNumber;

        if (secondNumber < smallestNumber){
            smallestNumber = secondNumber;
        }
        if (thirdNumber < smallestNumber){
            smallestNumber = thirdNumber;
        }
        if (fourthNumber < smallestNumber){
            smallestNumber = fourthNumber;
        }
        if (fifthNumber < smallestNumber){
            smallestNumber = fifthNumber;
        }

        if (secondNumber > largestNumber){
            largestNumber = secondNumber;
        }
        if (thirdNumber > largestNumber){
            largestNumber = thirdNumber;
        }
        if (fourthNumber > largestNumber){
            largestNumber = fourthNumber;
        }
        if (fifthNumber > largestNumber){
            largestNumber = fifthNumber;
        }

        System.out.println("smallest number is " + smallestNumber);
        System.out.println("largest number is " + largestNumber);
    }
}
