package viev.action;

import model.Garage;
import viev.action.Command;
import viev.panels.LightPanel;

public class GarageDoorCommand implements Command {
    private final Garage garage;
    private final LightPanel lightPanel;

    public GarageDoorCommand(Garage garage, LightPanel lightPanel) {
        this.garage = garage;
        this.lightPanel = lightPanel;
    }

    @Override
    public void execute() {
        garage.closeDoor();
        lightPanel.setLightOn(false);
        System.out.println("Ворота закрыты, свет выключен");
    }

    @Override
    public void unexecute() {
        garage.openDoor();
        lightPanel.setLightOn(true);
        System.out.println("Ворота открыты, свет включен");
    }
}