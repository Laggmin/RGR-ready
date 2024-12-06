package model;

public class Garage {
    private boolean doorOpen = false;
    private boolean lightOn = false;

    public void openDoor() {
        doorOpen = true;
    }

    public void closeDoor() {
        doorOpen = false;
    }

    public void turnLightOn() {
        lightOn = true;
    }

    public void turnLightOff() {
        lightOn = false;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public boolean isLightOn() {
        return lightOn;
    }
}