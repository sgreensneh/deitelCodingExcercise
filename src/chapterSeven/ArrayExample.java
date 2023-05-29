package chapterSeven;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
//        int [] number = new int[10];
//        System.out.println(Arrays.toString(number));
//
//        number [0] = 9;
//        number [1] = 8;
//        number [8] = 77;
//        number [3] = 333;
//        number [2] = 123;
//        System.out.println(Arrays.toString(number));
//        System.out.println(number[1] +" "+number[8]);
        int [] numbers = {50, 10, 33, 22, 11, 77, 80};
//        int x = numbers[numbers.length -1];
//        System.out.println(x);
        Arrays.stream(numbers).forEach(System.out::println);

        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("");
        for (int number : numbers){
            System.out.println(number);
        }

    }
}
