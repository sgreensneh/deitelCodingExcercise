package chapterSeventeen;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name ?");
        String  name = scanner.nextLine();
        System.out.println("How old are you ?");
        int age = scanner.nextInt();

        biConsumer.accept(name,age);

    }

    static BiConsumer<String, Integer> biConsumer = (name, age)-> System.out.println(name+" "+age);
}
