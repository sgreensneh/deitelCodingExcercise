package arrays;

public class Practice {
    public static void main(String[] args) {
        int[] numbers = {10,50, 60,25,15};

        int total = 0;
        for (int number : numbers) {
            total += number;
        }

        System.out.println(total);
    }
}
