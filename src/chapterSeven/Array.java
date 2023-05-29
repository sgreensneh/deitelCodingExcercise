package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many score you want to add: ");
        int numberOfScores = input.nextInt();
        int[] scores = new int[numberOfScores];
        int sum = 0;

        for (int index = 0; index < numberOfScores ; index++) {
            System.out.println("Enter score: " + (index+1));
            scores[index] = input.nextInt();
        }
        System.out.println("After storing scores -->" + Arrays.toString(scores));
        for (int index = 0; index < scores.length; index++) {
            sum += scores[index];

        }
        System.out.println("sum ==> " + sum);

    }
}
