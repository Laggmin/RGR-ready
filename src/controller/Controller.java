package controller;

import model.Garage;
import viev.MyFrame;
import viev.action.Command;
import viev.action.GarageDoorCommand;
import viev.action.LightCommand;
import viev.panels.*;

import java.awt.*;

public class Controller {
    private final Garage garage;
    private final MyFrame frame;
    private final ControlPanel controlPanel;
    private final DoorPanel doorPanel;
    private final LightPanel lightPanel;

    private Command command;
    private ObjectColor currentColor;
    private AbstractPanel activePanel;

    public Controller() {
        garage = new Garage();

        // Инициализация панелей
        lightPanel = new LightPanel(ObjectColor.LIGTCOLOR);
        doorPanel = new DoorPanel(ObjectColor.GARAGECOLOR);
        controlPanel = new ControlPanel(this);

        // Установка начального состояния
        selectGarage();

        // Создаем окно интерфейса
        frame = new MyFrame(controlPanel, lightPanel, doorPanel);
    }

    public void selectGarage() {
        command = new GarageDoorCommand(garage, lightPanel);
        currentColor = ObjectColor.GARAGECOLOR;
        activePanel = doorPanel;
        System.out.println("Выбрано управление воротами");
    }

    public void selectLight() {
        command = new LightCommand(garage);
        currentColor = ObjectColor.LIGTCOLOR;
        activePanel = lightPanel;
        System.out.println("Выбрано управление светом");
    }

    public void turnOn() {
        command.execute();
        updatePanelColor(currentColor.on);
        System.out.println("Включено");
    }

    public void turnOff() {
        command.unexecute();
        updatePanelColor(currentColor.off);
        System.out.println("Выключено");
    }

    public void openDoor() {
        doorPanel.setDoorOpen(true);
        lightPanel.setLightOn(true);
        System.out.println("Ворота открыты, свет включен");
    }

    public void closeDoor() {
        doorPanel.setDoorOpen(false);
        lightPanel.setLightOn(false);
        System.out.println("Ворота закрыты, свет выключен");
    }

    private void updatePanelColor(Color color) {
        activePanel.setColor(color);
        activePanel.repaint();
    }
}
