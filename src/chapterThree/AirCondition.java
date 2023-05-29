package chapterThree;

public class AirCondition {

    private boolean power;
    private int temperature;
    public void setOn() {
        power = true;
    }


    public boolean getPower() {
        return power;
    }

    public void setOff() {
        power = true;
    }

    public void initialTemperature(int degree) {
        temperature = degree;
    }

    public void increaseTemperature(int degree) {

        if (temperature < 30){
            temperature = temperature + degree;

        }

    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int degree) {
        if (temperature > 16) {
            temperature = temperature - degree;
        }
    }
}
