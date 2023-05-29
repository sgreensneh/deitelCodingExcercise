package practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        prime(num);
    }
    public static void prime(int number){
        boolean prime =  true;
        for (int i = 2; i < number ; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime);
    }


}
