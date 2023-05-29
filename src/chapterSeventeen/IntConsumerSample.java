package chapterSeventeen;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class IntConsumerSample {
    public static void main(String[] args) {
        IntConsumer intConsumer = System.out::println;
        intConsumer.accept(10000);

        DoubleConsumer doubleConsumer = System.out::println;
        doubleConsumer.accept(10);

    }
}
