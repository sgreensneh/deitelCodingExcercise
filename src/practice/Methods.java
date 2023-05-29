package practice;

public class Methods {
    public static void main(String[] args) {
//        System.out.println(green("Sgreen"));
        String name = green("Sgreen");


    }

    private static String green(String name) {
        if (name.equals("green")) {
            System.out.println("Good try");
        } else if (name.equals("Sgreen")) {
            System.out.println("Thats what's up!");
        } else {
            System.out.println("Go harder");
        }
        return "My name is " + name;
    }
}
