package problemSolving;

import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int indexToRemove = 0;

        for(int i = indexToRemove; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        int[] newArray = new int[array.length - 1];
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        System.out.println(Arrays.toString(newArray)); // Output: [1, 2, 4, 5]

    }
}
