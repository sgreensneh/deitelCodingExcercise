package assessments;

public class SumOfIntegers {
    public static void main(String[] args) {
        int number = 30;
        int sumOfNumbers = 0;
        for (int i = 1; i <= number ; i++) {
            if(i % 3 == 0) sumOfNumbers += i;
        }
        System.out.println(sumOfNumbers);
    }
}
