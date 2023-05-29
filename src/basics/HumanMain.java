package basics;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Sgreen",25,6.2);
        Human human1 = new Human("Sunny", 20, 5.8);

        System.out.println(human.name);
        human.eat();
        human.talk();
        System.out.println();
        System.out.println(human1.name);
        human1.eat();
        human1.talk();
    }
}
