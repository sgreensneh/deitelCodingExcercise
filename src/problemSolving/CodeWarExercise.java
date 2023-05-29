package problemSolving;

import java.util.Arrays;

public class CodeWarExercise {
    public static void main(String[] args) {
        int[] integers = {2,4,7,8,10};
        System.out.println(Arrays.toString(findOutLier(integers)));

    }

    public static int[] findOutLier(int[] outlier){
        int oddNumber = 0;
        for (int numbers:outlier){
            if (numbers % 2 != 0){
                oddNumber++;
            }
        }

        int[] listOfOddNumber = new int[oddNumber];
        int getOddNumber = 0;
        for (int counter = 0; counter < outlier.length; counter++) {
            if(outlier[counter] % 2 != 0){
                listOfOddNumber[getOddNumber] = outlier[counter];
                getOddNumber++;
            }
        }

        return listOfOddNumber;
    }
}
