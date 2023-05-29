package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );


        int milesDriven = 0;
        int gallonsUsed = 0;

        while (true){
            System.out.println( " Enter miles driven for each trip:( press 0 to exist) ");
            int miles = input.nextInt();
            milesDriven+=miles;
            if(miles == 0){
                break;
            }
            System.out.println("Enter gallons used for each trip:( press 0 to exist) ");
            int gallons = input.nextInt();
            gallonsUsed+=gallons;

            double milesPerGallons = (double) miles/gallons;
            System.out.printf("miles per gallon obtained for each trip is %.2f%n ", milesPerGallons);


        }
        double TotalMilesPerGallons =(double) milesDriven/gallonsUsed;
        System.out.printf("combined miles per gallon obtained for all trips is %.2f%n ", TotalMilesPerGallons);
    }
}
