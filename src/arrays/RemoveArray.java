package arrays;

import java.util.Arrays;

public class RemoveArray {
    public static void main(String[] args) {
        int[] array = {5,3,4,6};
        System.out.println(Arrays.toString(minMax(array)));

    }
    public static int[] minMax(int[] number) {
        int [] copy = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            int sum = 0;
            for (int j = 0; j < number.length; j++) {
                if (i!=j)sum += number[j];
            }
            copy[i] = sum;
        }
        return copy;
    }


}
