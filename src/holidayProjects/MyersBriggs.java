package holidayProjects;

import java.util.Scanner;

public class MyersBriggs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Myers-Briggs questionnaire!");
        System.out.println("This questionnaire will help determine your personality type according to the Myers-Briggs theory.");
        System.out.println("Please answer the following questions honestly.");
        System.out.println();


        System.out.println("Question 1: Do you prefer to focus on the outer world or on your own inner thoughts?");
        System.out.println("1. Outer world");
        System.out.println("2. Inner thoughts");
        int answer = input.nextInt();

        String personalityType = "";
        if (answer == 1) {
            personalityType += "E";
        } else if (answer == 2) {
            personalityType += "I";
        }

        System.out.println("Question 2: Do you prefer to focus on the basic information you take in or do you prefer to interpret and add meaning?");
        System.out.println("1. Basic information");
        System.out.println("2. Interpret and add meaning");
        answer = input.nextInt();

        if (answer == 1) {
            personalityType += "S";
        } else if (answer == 2) {
            personalityType += "N";
        }

        System.out.println("Question 3: Do you prefer to make decisions based on facts and logic or based on personal values and feelings?");
        System.out.println("1. Facts and logic");
        System.out.println("2. Personal values and feelings");
        answer = input.nextInt();

        if (answer == 1) {
            personalityType += "T";
        } else if (answer == 2) {
            personalityType += "F";
        }

        System.out.println("Question 4: In dealing with the outside world, do you prefer to get things decided or do you prefer to stay open to new information and options?");
        System.out.println("1. Get things decided");
        System.out.println("2. Stay open to new information and options");
        answer = input.nextInt();

        if (answer == 1) {
            personalityType += "J";
        } else if (answer == 2) {
            personalityType += "P";
        }

        System.out.println("Your personality type is: " + personalityType);
    }
}
