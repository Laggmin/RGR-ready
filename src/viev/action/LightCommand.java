package viev.action;

import model.Garage;
import viev.action.Command;

public class LightCommand implements Command {
    private final Garage garage;

    public LightCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.turnLightOn();
    }

    @Override
    public void unexecute() {
        garage.turnLightOff();
    }
}