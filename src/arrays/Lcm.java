package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lcm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(lcmChecker(20)));
    }

    public static int[] lcmChecker(int number) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            while(number % i == 0){
                numbers.add(i);
                number = number/i;
            }
        }
        int[] copyOfNumbers = new int[numbers.size()];
        for(int i = 0; i < copyOfNumbers.length; i++){
            copyOfNumbers[i] = numbers.get(i);
        }
        return copyOfNumbers;
    }
}
