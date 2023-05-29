package arrays;

import java.util.Arrays;

public class TicTac {
    public static void main(String[] args) {
        char [][] tictac = {{'x','o','x'}, {'o','o','x'}, {'x','o','o'}};
        for(char[] values: tictac) {
            System.out.println(Arrays.toString(values));
        }
        for (char[] value: tictac) {
            for (char values : value) {
                if(values == 'x'){
                    System.out.print(1+ " ");
                }else if (values == 'o'){
                    System.out.print(0+ " ");
                }
            }
            System.out.println();
        }


    }
}
