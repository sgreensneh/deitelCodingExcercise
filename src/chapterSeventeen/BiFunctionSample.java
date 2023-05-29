package chapterSeventeen;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        System.out.println(biFunction.apply(200, 50));

    }
    static BiFunction<Integer, Integer, String> biFunction = (firstInput, secondInput) -> firstInput+secondInput+"";

}
