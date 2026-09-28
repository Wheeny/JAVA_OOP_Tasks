package myAc;

public class AirConditioner {

    private boolean state;
    private int temperature;

    public boolean isOn() {
        return state;
    }

    public void turnOn() {
        state = true;
        temperature = 16;

    }

    public void turnOff() {
        state = false;

    }

    public void increaseTemp() {
        if (temperature < 30) temperature += 1;
    }

    public int checkTemp() {
        return temperature;
    }

    public void decreaseTemp() {
        if(temperature > 16) temperature -= 1;
    }
}
