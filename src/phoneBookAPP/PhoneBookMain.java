package phoneBookAPP;

import javax.swing.*;

public class PhoneBookMain {
    private static PhoneBook phoneBook = new PhoneBook();
    public static void main(String[] args) {
        goToMainMenu();

    }

    public  static void goToMainMenu(){
        String mainMenu = """
                Welcome to phoneBook:
                1-> Add a contact
                2-> View contact
                3-> Delete contact
                4-> Update contact
                5-> Exit
                
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)){
            case '1' -> addContact();
            case '2' -> viewContact();
            case '3' -> deleteContact();
            case '4' -> updateContact();
            case '5' -> exit();
            default -> goToMainMenu();
        }
    }

    private static void updateContact() {
    }

    private static void deleteContact() {

    }

    private static void viewContact() {

    }

    private static void addContact() {


    }


    private static void exit() {
        display("Thank you for using our application ");
        System.exit(1);

    }

    private static String input(String Prompt){
        return JOptionPane.showInputDialog(Prompt);
    }
    private static void display(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }
}
