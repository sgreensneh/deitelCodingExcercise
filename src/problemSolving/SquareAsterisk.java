package problemSolving;

import java.util.Scanner;

public class SquareAsterisk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to display in asterisk");
        int side = scanner.nextInt();
        squareOfAsterisks(side);

    }

   static void squareOfAsterisks(int side){
        for (int i = 1; i <= side; i++){
            for (int j = 1; j <= side ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
