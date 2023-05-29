package copyAsObject;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Chevrolet","Corvette",2021);
//        Car car1 = new Car("Ford","Mustang",2022);
//        car1.copyObject(car);
        Car car1 = new Car(car);

        System.out.println(car);
        System.out.println(car1);
        System.out.println();
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

    }
}
