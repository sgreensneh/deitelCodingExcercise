package copyAsObject;

public class Car {
    private String make;
    private  String model;
    private int year;

    Car(String make, String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;

    }
    Car(Car car){
        this.copyObject(car);

    }

    void copyObject(Car car){
        this.setMake(car.getMake());
        this.setModel(car.getModel());
        this.setYear(car.getYear());

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
