package chapterSeventeen;

public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();

        CarMethod carMethod = () -> System.out.println("move");



        toyota.move(carMethod);
//        toyota.stop(carMethod);
    }
}
