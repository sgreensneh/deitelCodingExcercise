package practice;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int counter = 1;
        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[rows].length; columns++) {
                array[rows][columns] = counter;
                counter++;
            }
        }
        for (int[] row : array)
            System.out.println(Arrays.toString(row));
        System.out.println(Arrays.deepToString(array));
    }
}
