package basics;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number to check their maximum");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        double result = maximum(number1,number2,number3);
        System.out.println("the maximum number is "+ result);


    }

    static double maximum(double a, double b, double c){
        double maximum = a;
        if (b > maximum){
            maximum = b;
        }
        if (c > maximum){
            maximum = c;
        }
        return maximum;
//        return Math.max(a,Math.max(b,c));

    }
}
