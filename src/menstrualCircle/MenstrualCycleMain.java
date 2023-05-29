package menstrualCircle;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class MenstrualCycleMain {

    public static void main(String[] args) {

        goTOMainMenu();
        Point point = new Point();

    }

    public static void goTOMainMenu() {
        String mainMenu = """
                ==============================================
                The most trusted and tested menstrual app...
                1 Track your menstrual flow.
                2 Exit
                ===============================================
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> {
                try {
                    trackMenstrualCycle();
                } catch (IllegalArgumentException e) {
                    display(e.getMessage());
                    goTOMainMenu();
                }
            }
            case '2' -> exit();
            default -> goTOMainMenu();
        }

    }


    private static void trackMenstrualCycle() {
        String userStartDate = input("Enter the start date of your last period (MM/dd/yyyy) (dd-MM-yyyy) (yyyy-MM-dd): ");
        String[] dates = userStartDate.contains("/") ? userStartDate.split("/"): userStartDate.split("-");
        if (Integer.parseInt(dates[2]) < 1000) throw new IllegalArgumentException("Year is incorrect!");
        if (userStartDate.split("/").length == 3 || userStartDate.split("-").length == 3) {
            LocalDate startDate = LocalDate.parse(userStartDate, DateTimeFormatter.ofPattern("[MM/dd/yyyy]" + "[dd-MM-yyyy]" + "[yyyy-MM-dd]"));
            int cycleLength = Integer.parseInt(input("Enter the length of your menstrual cycle (in days): "));
            MenstrualCycle menstrualCircle = new MenstrualCycle(startDate, cycleLength);

            LocalDate currentCycleEndDate = menstrualCircle.getCurrentCycleEndDate();
            LocalDate nextCycleStartDate = menstrualCircle.getNextCycleStartDate();

            display("Your current menstrual cycle ends on: " + currentCycleEndDate);
            display("Your next menstrual cycle is expected to start on: " + nextCycleStartDate);
        } else throw new IllegalArgumentException("Incorrect date format, please try again.");
    }

    private static void exit() {
        display("Feel free to visit again :) ");
        System.exit(1);
    }


    public static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    public static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
