package selfWork;

public class Main {
    public static void main(String[] args)  {


            System.out.println(divide(10, 0));

    }
    public static int divide(int a, int b) {
        if(b == 0){
            throw new unCheckedException("Can't be divided by zero");
        }
        return a/b;

    }
}
