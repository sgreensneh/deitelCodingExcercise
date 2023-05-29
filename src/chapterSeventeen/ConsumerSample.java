package chapterSeventeen;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
//        Consumer<String> consumer = System.out::println;
//        consumer.accept("Sgreen");
//
//        consumerDeclarative.accept("green");
//        consumerImperative(450);

        Consumer<String> andThen = consumerDeclarative.andThen(after);
        andThen.accept("Becky");

    }

    static  Consumer<String> consumerDeclarative = System.out::println;
    static  Consumer<String> after = name -> System.out.println(name + " 89");

    public  static  void  consumerImperative(int age){
        System.out.println(age);
    }



}
