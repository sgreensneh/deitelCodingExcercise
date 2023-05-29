package problemSolving;

import java.util.Scanner;

public class SingleDigitReduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer: ");
        int userInput = input.nextInt();
        System.out.println(reduceNumber(userInput));

    }

    public static int reduceNumber(int number){
        if(number < 10){
            return number;
        }else {
            int sum = 0;
            while (number > 0){
                sum += number % 10;
                number /= 10;
            }
            return reduceNumber(sum);
        }

    }
}
