package chapterThree;

public class AutomaticBike {

    private boolean on;
    private boolean off;
    private int speed;



    public boolean getOn() {
        return true;
    }



    public void setSpeed(int speed) {
       this.speed = speed;
    }


    public void setOn() {
        on = true;
    }

    public void setOff() {
        off = true;
    }


    public int getSpeed() {
        return speed;
    }


    public void setAccelerate(int gear) {
        speed = speed + gear;
    }


    public int getAccelerate() {
        return speed;
    }


    public void setDeccelerate(int gear) {
        speed = speed - gear;
    }

    public int deccelerate() {
        return speed;
    }
}
