package problemSolving;

import java.util.Arrays;

public class ReversalArray {
    public static void main(String[] args) {
        int [] numbers = {10, 12, 3, 4};
        int [] numbers2 = new int[numbers.length];
        int count = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers2[count] = numbers[i];
            count++;
        }
        System.out.println(Arrays.toString(numbers2));
    }
}
