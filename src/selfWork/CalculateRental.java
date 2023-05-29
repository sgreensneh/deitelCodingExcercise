package selfWork;

public class CalculateRental {
    public static void main(String[] args) {
        double result = solution();
        System.out.printf("Rental yield per year is %.2f \n", result);
        System.out.printf("Rental yield per year is %.2f", solution2(1300, 250_000));


    }

    public static double solution() {
        double rentalIncome = 1300;
        double annualRental = rentalIncome * 12;
        double propertyPrice = 250_000;
        return (annualRental / propertyPrice) * 100;
    }

    public static double solution2(double rent, double propertyPrice) {
        double annualRental = rent * 12;
        return (annualRental / propertyPrice) * 100;


    }
}
