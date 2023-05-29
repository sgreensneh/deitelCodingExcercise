package chapterFourteen;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth in this format (dd/MM/yyyy)");
        String userInput = scanner.next();

        try{
            System.out.println(convert(userInput));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public static int convert(String date) {
        if (date.split("/").length == 3) {
            LocalDate localDate = LocalDate.now();
            LocalDate userDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            int age = Period.between(userDate, localDate).getYears();
            return age;
        }
        throw new IllegalArgumentException("Wrong date format");
    }
}
