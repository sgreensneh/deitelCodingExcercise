package assessments;

public class largestNumber {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 10;

        System.out.println(largestNumber(num1,num2));

}

public static int largestNumber(int num1, int  num2){
        int largestNumber = num1;
        if(num2 > largestNumber) largestNumber = num2;
        return largestNumber;
    }


}
