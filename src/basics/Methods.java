package basics;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        System.out.println("the sum of the two digits is "+add(firstNumber, secondNumber));
    }

    static int  add(int firstNumber, int secondNumber){
       return firstNumber + secondNumber;

    }
}
