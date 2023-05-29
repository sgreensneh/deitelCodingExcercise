package practice;

public class MethodExample {
    public static void main(String[] args) {
MethodExample method = new MethodExample();
method.myPublicMethod();
staticMethod();

    }
     void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    public static int staticMethod(){
        System.out.println("Sgreen is a nice guy.");
        return 0;
    }
}
