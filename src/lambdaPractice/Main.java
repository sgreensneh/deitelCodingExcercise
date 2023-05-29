package lambdaPractice;

public class Main {
    public static void main(String[] args) {
//        Human human = new Human();
//        speak(human);
        HumanInterface copyOfHuman = () -> System.out.println("Speak your truth...");
        speak(copyOfHuman);
//        speak(()-> System.out.println("Speak your truth..."));

    }

    public static void speak(HumanInterface humanInterface) {
        humanInterface.speak();
    }
}
