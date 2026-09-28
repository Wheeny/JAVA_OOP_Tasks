package bike;

public class Bike {

    private boolean state;
    private int gearSpeed;

    public boolean isOn(){
        return state;
    }

    public void turnOn() {
        state = true;

    }

    public void turnOff() {
        state = false;
    }

    public void accelerate() {
        if(gearSpeed >= 0 && gearSpeed <= 20) gearSpeed += 1;
        else if(gearSpeed >= 21 && gearSpeed <= 30) gearSpeed += 2;
        else if(gearSpeed >= 31 && gearSpeed <= 40) gearSpeed += 3;
        else gearSpeed += 4;
    }

    public int checkGear() {
    return gearSpeed;
    }

    public void decelerate() {
        if(gearSpeed >= 0 && gearSpeed <= 20) gearSpeed -= 1;
        else if(gearSpeed >= 21 && gearSpeed <= 30) gearSpeed -= 2;
        else if(gearSpeed >= 31 && gearSpeed <= 40) gearSpeed -= 3;
        else gearSpeed -= 4;
    }
}
