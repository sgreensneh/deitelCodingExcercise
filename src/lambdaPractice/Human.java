package lambdaPractice;

public class Human implements HumanInterface{


    String name;
    int age;

    public Human() {

    }

    @Override
    public void speak() {
        System.out.println("I'm talking");
    }
}
