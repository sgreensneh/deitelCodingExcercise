package chapterFour;

import java.util.Scanner;

public class CheckSize {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your shoe size: ");
            int userInput = input.nextInt();
            String size;

            switch (userInput) {

                case 29:
                    size = "Small";
                    break;

                case 42:
                    size = "Medium";
                    break;

                case 44:
                    size = "Large";
                    break;

                case 48:
                    size = "Extra Large";
                    break;

                default:
                    size = "Unknown";
                    break;

            }
            System.out.println("Size: " + size);
        }

}
