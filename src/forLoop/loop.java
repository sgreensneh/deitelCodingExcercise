package forLoop;

public class loop {
    public static void main(String[] args) {
        for (int i= 1; i <= 4; i++) {
            if (i == 1){
                System.out.printf("%-5s","N");
            }else if (i > 1){
                System.out.printf( "%-5s", "N" + i);
            }
        }
        System.out.println();
        for (int row = 1; row <=5 ; row++) {
            int copyOfRow = row;
            for (int column = 0; column < 4; column++) {
                System.out.printf("%-5d", copyOfRow);
                copyOfRow *= row;
            }
            System.out.println();
        }
    }
}
