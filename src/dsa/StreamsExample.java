package dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);1
//        Stream<Integer> stream = numbers.stream();
//
//        Stream<Integer> evenStream = stream.filter(n -> n % 2 == 0);
//        evenStream.forEach(System.out::println);
        Stream.of(1, 2, 3, 4, 5).filter(n -> n % 2 == 0).forEach(System.out::println);


    }
}
