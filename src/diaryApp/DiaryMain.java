package diaryApp;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DiaryMain {
    private static Diary diary = new Diary();
    private static LocalDateTime localDateTime = LocalDateTime.now();
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("mm-dd-yyyy hh:mm a");

    public static void main(String[] args) {
        goToMainMenu();
    }

    public static void goToMainMenu() {
        String mainMenu = dateTimeFormatter.format(localDateTime) + "\n" + """
                ====================
                Welcome to diaryBook:
                1->Create an entry
                2->View entry
                3->Count entry
                4->Delete entry
                5->Edit dairy
                6->Exit
                ====================
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> creatEntry();
            case '2' -> viewEntry();
            case '3' -> countEntry();
            case '4' -> deleteEntry();
            case '5' -> {
                userInput = input("""
                        1 Edit tittle
                        2 Edit body
                        """);
                switch (userInput.charAt(0)) {
                    case '1' -> editTittle();
                    case '2' -> editBody();
                    default -> goToMainMenu();
                }
            }
            case '6' -> exit();
            default -> goToMainMenu();

        }

    }

    private static void editBody() {
        try {

            int entryId = Integer.parseInt(input("Enter the id of the entry you want to edit: "));
            String body = input("Edit the body: ");
            String editBody = String.format("%s", diary.findEntry(entryId));
            display(editBody);

            diary.editBody(entryId, body);
            goToMainMenu();
        } catch (IndexOutOfBoundsException e) {
            display(e.getMessage());
        }
        goToMainMenu();
    }

    private static void editTittle() {
        try {
            int entryId = Integer.parseInt(input("Enter the id of the entry you want to edit: "));
            String tittle = input("Edit the tittle: ");
            diary.editTittle(entryId, tittle);
            goToMainMenu();
        } catch (IndexOutOfBoundsException e) {
            display(e.getMessage());
        }
        goToMainMenu();

    }

    private static void deleteEntry() {
        try {
            int entryId = Integer.parseInt(input("Enter the id of the entry you want to delete: "));
            diary.deleteEntry(entryId);
            display("You deleted " + entryId + " entry successfully");

            goToMainMenu();
        } catch (IndexOutOfBoundsException e) {
            display(e.getMessage());
        }
        goToMainMenu();
    }

    private static void countEntry() {
        display(String.format("""
                They're %s entries so far...""", diary.countEntry()));
        goToMainMenu();

    }

    private static void viewEntry() {
        try {
            int id = Integer.parseInt(input("Enter id number: "));
            String eBook = String.format("%s", diary.findEntry(id)).toString();
            display(eBook);
            goToMainMenu();
        } catch (IndexOutOfBoundsException e) {
            display(e.getMessage());
        }
    }

    private static void creatEntry() {
        String tittle = input("Enter a tittle to create a diary: ");
        String body = input("Enter a body to create a diary: ");
        int id = Integer.parseInt(input("Enter an id to validate creating an entry: "));
        diary.createAnEntry(tittle, body, id);
        display(dateTimeFormatter.format(localDateTime) + "\n" + diary.countEntry() + " Diary created successfully");

        goToMainMenu();

    }

    private static void exit() {
        display("Thank you for using our application ");
        System.exit(1);

    }

    private static String input(String Prompt) {
        return JOptionPane.showInputDialog(Prompt);
    }

    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }


}
