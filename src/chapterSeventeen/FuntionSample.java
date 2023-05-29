package chapterSeventeen;

import java.util.function.Function;

public class FuntionSample {
    public static void main(String[] args) {

        Function<Integer,Integer> result = function.andThen(function2);
        System.out.println(result.apply(10));

    }
    static Function<Integer,String> function = userInput -> userInput * 20 + "";
    static Function<String,Integer> function2 = userInput -> userInput.length();
}
