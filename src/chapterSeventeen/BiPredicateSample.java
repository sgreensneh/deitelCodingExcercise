package chapterSeventeen;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        System.out.println(biPredicate.test("green", 5));

    }

    static BiPredicate<String,Integer> biPredicate = (name, age)-> name.length() == age;
}
