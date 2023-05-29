package chapterFour;

import java.util.Scanner;

public class Nokia {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu(input);
    }

    private static void mainMenu(Scanner input) {
        System.out.println("""
                mainMenu:
                1 phone book
                2 messages
                3 chat
                4 call register
                5 Tones
                6 settings
                7 call divert
                8 games
                9 calculators
                10 reminder
                11 clock
                12 profiles
                13 sim service
                14 Exist
                """);
        System.out.println("Enter a number for menu functions: ");
        int userInput = input.nextInt();
        switch (userInput) {
            case 1 :
                userInput = phoneBook(input);
                mainMenu(input);
        }
        switch (userInput){
            case 2:
                userInput = messageMenu(input);
                mainMenu(input);


        }
        switch (userInput){
            case 3:
                System.out.println("""
                        Chat
                        1 Back
                        """);
                System.out.println("Enter a number for menu function: ");
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("""
                                Back
                                """);break;
                }
        }
        switch (userInput){
            case 4:
                System.out.println("""
                        Call register:
                        1 Missed calls
                        2 Received calls
                        3 Dialled numbers
                        4 Erase recent call list
                        5 Show call duration
                        6 Show call  cost
                        7 Call cost settings
                        8 Prepaid credit
                        9 Back
                        
                        """);
                System.out.println("Enter a number for menu function: ");
                userInput = input.nextInt();
                switch (userInput){
                    case 5:
                        System.out.println("""
                                1 Last call duration
                                2 All call duration
                                3 Received call's duration
                                4 Dailled call's duration
                                5 Clear timers
                                6 Back
                                """);
                        break;
                    case 6:
                        System.out.println("""
                           1 Last call cost
                           2 All call's cost
                           3 Clear counters
                           4 Back
                                """);break;
                    case 7:
                        System.out.println("""
                                1 Call cost limit
                                2 Show costs in
                                3 Back
                               """);break;
                    case 8:
                        System.out.println("""
                                1 Back
                                """);
                        System.out.println("Enter a number for menu function: ");
                        userInput = input.nextInt();
                        switch (userInput){
                            case 1:
                                System.out.println("""
                                        Back
                                        """);break;
                        }
                }
        }
        switch (userInput){
            case 5:
                System.out.println("""
                        1 Ringing tone
                        2 Ringing volume
                        3 Incoming call alert
                        4 Composer
                        5 Message alert tone
                        6 Keypad tones
                        7 Warning and game tones
                        8 Vibrating alert
                        9 Screen saver
                        10 Back
                        """);
                System.out.println("Enter a number for menu function: ");
                userInput = input.nextInt();
                switch (userInput){
                    case 10:
                        System.out.println("""
                                Back
                                """);break;
                }
        }
        switch (userInput){
            case 6:
                System.out.println("""
                        1 Call settings
                        2 Phone settings
                        3 Security settings
                        4 Restore factory settings
                        5 Back
                        """);
                System.out.println("Enter a number for menu function: ");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("""
                                1 Automatic redial
                                2 Speed dailling
                                3 Call waiting options
                                4 Own number sending
                                5 Phone line in use
                                6 Automatic answer
                                7 Back
                                """);break;
                    case 2:
                        System.out.println("""
                                1 Language
                                2 Cell info display
                                3 Welcome note
                                4 Network selection
                                5 Lights
                                6 Confirm sim service actions
                                7 Back
                                """);break;
                    case 3:
                        System.out.println("""
                                1 Pin code request
                                2 Call barring service
                                3 Fixed dailing
                                4 Closed user group
                                5 Phone security
                                6 Change access codes
                                7 Back
                                """);break;
                    case 4:
                        System.out.println("""
                                1 Back
                                """);
                        System.out.println("Enter a number for menu function: ");
                        userInput = input.nextInt();
                        switch (userInput){
                            case 1:
                                System.out.println("""
                                        Back
                                        """);break;
                        }
                }
        }
        switch (userInput) {
            case 7:
                System.out.println("""
                        1 back
                        """);
                System.out.println("Enter a number for menu function: ");
                userInput = input.nextInt();

        }
        switch (userInput) {
            case 8:
                System.out.println("""
                        1 Back
                        """);
                System.out.println("Enter a number for menu function: ");
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("""
                                Back
                                """);break;
                }
        }
        switch (userInput){
            case 9:
                System.out.println("""
                        1 Back
                        """);
                System.out.println("Enter a number for menu function: ");
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("""
                                Back
                                """);break;
                }
        }
        switch (userInput) {
            case 10:
                System.out.println("""
                        1 back
                        """);
                System.out.println("Enter a number for menu function: ");
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("""
                                back
                                """);break;
                }
        }
        switch (userInput){
            case 11:
                System.out.println("""
                        1 Alarm clock
                        2 clock settings
                        3 Date settings
                        4 Stopwatch
                        5 Countdown timer
                        6 Auto update of date and time
                        7 Back
                        """);
                System.out.println("Enter a number for menu function: ");
                userInput = input.nextInt();
                switch (userInput){
                    case 7:
                        System.out.println("""
                                back
                                """);
                }
        }
        switch (userInput){
            case 12:
                System.out.println("""
                        1 Back
                        """);
                System.out.println("Enter a number for menu function: ");
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("""
                                Back
                                """);break;
                }
        }
        switch (userInput) {
            case 13:
                System.out.println("""
                        1 Back
                        """);
                System.out.println("Enter a number for menu function: ");
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("""
                                Back
                                """);
                }
        }
    }

    private static int messageMenu(Scanner input) {
        int userInput;
        System.out.println("""
                messageMenu
                1 write message
                2 Inbox
                3 Outbox
                4 Picture messages
                5 Templates
                6 Smilleys
                7 Message settings
                8 Info service
                9 voice mailbox number
                10 Service command editor
                11 Back
             
                 """);
        System.out.println("Enter a number for menu function: ");
        userInput = input.nextInt();
        switch (userInput){
            case 7:
                userInput = messageSettings(input);
                messageMenu(input);

        }
        return userInput;
    }

    private static int messageSettings(Scanner input) {
        int userInput;
        System.out.println("""
                1 Set
                2 Common
                3 Back
                """);
        System.out.println("Enter a number for menu function: ");
        userInput = input.nextInt();
        switch (userInput){
            case 1:
                System.out.println("""
                        SetMenu
                        1 Message center number
                        2 Message sent as
                        3 Message validity
                        4 Back
                        """);
                System.out.println("Enter a number for menu function: ");
                userInput = input.nextInt();
                switch (userInput){
                    case 4:
                        System.out.println("""
                                Back
                                """);break;
            case 2:
                System.out.println("""
                        Common
                        1 Delivery reports
                        2 Reply via same centre
                        3 Character support
                        4 Back
                        """);
                System.out.println("Enter a number for menu function: ");
                userInput = input.nextInt();
                switch (userInput){
                    case 4:
                        System.out.println("""
                                Back
                                """);break;
                }
            }
        }
        switch (userInput) {
            case 11:
                System.out.println("""
                        back
                        """);break;
        }
        return userInput;
    }

    private static int phoneBook(Scanner input) {
        int userInput;
        System.out.println("""
                PhonebookMenu:
                1 Search
                2 Search Nos.
                3 Add name1
                4 Erase
                5 Edit
                6 Assign tone
                7 Send b'card
                8 Options 
                9 Speed dials
                10 Voice tags
                11 Back
                """);
        System.out.println("Enter a number for menu function:  ");
        userInput = input.nextInt();
        switch (userInput) {
            case 8:
                userInput = phoneBookOptions(input);
        }
        switch (userInput){
            case 11:
                System.out.println("""
                        Back
                        """);break;
        }
        return phoneBook(input);
    }

    private static int phoneBookOptions(Scanner input) {
        int userInput;
        System.out.println("""
                1 Time of views
                2 Memory status
                3 Back
                """);
        System.out.println("Enter a number for menu function: ");
        userInput = input.nextInt();
        switch (userInput){
            case 3:
                System.out.println("""
                        Back
                        """);break;
        }
        return userInput;
    }
}
