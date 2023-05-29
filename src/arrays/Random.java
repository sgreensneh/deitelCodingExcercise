package arrays;

import java.security.SecureRandom;

public class Random {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        for (int i = 1; i <= 20 ; i++) {
            int x =  random.nextInt(6)+1;

            System.out.printf("%d ", x);

            if(i %5==0){
                System.out.println();
            }
        }


    }
}
