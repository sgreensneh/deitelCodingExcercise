package problemSolving;

import java.util.Scanner;

public class Maskify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name or a number you want to mask: ");
        String userInput = input.nextLine();
        System.out.println(maskify(userInput));
    }

    public static String maskify(String mask) {
        if (mask.length() > 4) {
            return new String( new char[mask.length()]).replace("\0","#")
                    + mask.substring(mask.length()-4);
        } else {
            return mask;
        }
    }
}
