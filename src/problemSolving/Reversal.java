package problemSolving;

import java.util.Scanner;

public class Reversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers: ");
        int userInput = input.nextInt();
        int reversal = 0;

        while (userInput > 0){
            reversal = reversal * 10 + userInput % 10;
            userInput /= 10;

        }
        System.out.println(reversal);




    }
}
