package chapterSeventeen;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Integer> andOperator = predicate.and(after);
        System.out.println(andOperator.test(10));


    }

    static Predicate<Integer> predicate = userInput -> userInput % 2 == 1;
    static  Predicate<Integer> after = userInput2 -> userInput2 >= 5;


}
