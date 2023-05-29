package dietelExercises;

public class Arrays {
    public static void main(String[] args) {

        int[][] arr = {{23,45,2,}, {24,56}};
        int[][]arr1 = {{200,22,}, {44,33,12}};

        array(arr);
        System.out.println();
        array(arr1);

    }

    public static void array(int[][] arrs){
        for (int rows = 0; rows < arrs.length; rows++) {
            for (int columns = 0; columns < arrs[rows].length; columns++) {
                System.out.print(" "+arrs[rows][columns]);

            }
            System.out.println();


        }


    }
}
