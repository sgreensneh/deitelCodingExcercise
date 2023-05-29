package selfWork;

import java.math.BigDecimal;

public class BigDecimalSample {
    public static void main(String[] args) {


        BigDecimal nums = new BigDecimal("0.02");
        BigDecimal nums2 = new BigDecimal("0.03");
        System.out.println(nums2.subtract(nums));


        double x = 0.02;
        double y = 0.03;
        double results = y - x;
        System.out.println(results);
    }
}
