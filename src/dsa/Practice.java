package dsa;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] numbers = {200, 12, 15, 50, 10};
        Arrays.stream(numbers).sorted().forEach(System.out::println);

//        Arrays.stream(numbers).forEach(System.out::println);
    }
}
