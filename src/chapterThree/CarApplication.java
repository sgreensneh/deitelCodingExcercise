package chapterThree;

public class CarApplication {
    public static void main(String[] args) {
        Car toyota = new Car("A5", "2021", 300000.00);
        Car benz = new Car("Camry", "2021", 500000.00);
        System.out.println(toyota.getPrice());
        System.out.println(benz.getPrice());
    }
}
