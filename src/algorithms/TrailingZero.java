package algorithms;

public class TrailingZero {
    public static void main(String[] args) {
        System.out.println(trailingZero(10));
    }

    public static  int trailingZero(int number){
        int count = 0;
        while (number > 0){
            number /= 5;
            count += number;
        }
return count;
    }
}
