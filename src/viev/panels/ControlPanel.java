package viev.panels;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    private final Controller controller;

    public ControlPanel(Controller controller) {
        this.controller = controller;
        setLayout(new GridLayout(4, 1, 10, 10));

        JButton garageButton = new JButton("Garage");
        JButton lightButton = new JButton("Light");
        JButton onButton = new JButton("ON");
        JButton offButton = new JButton("OFF");

        onButton.setBackground(Color.green);
        offButton.setBackground(Color.red);

        garageButton.setBackground(Color.lightGray);
        lightButton.setBackground(Color.lightGray);

        add(garageButton);
        add(lightButton);
        add(onButton);
        add(offButton);

        garageButton.addActionListener(e -> {
            controller.selectGarage();
            updateButtonState(garageButton, lightButton);
        });

        lightButton.addActionListener(e -> {
            controller.selectLight();
            updateButtonState(lightButton, garageButton);
        });

        onButton.addActionListener(e -> controller.turnOn());
        offButton.addActionListener(e -> controller.turnOff());

        updateButtonState(garageButton, lightButton);
    }

    private void updateButtonState(JButton selected, JButton other) {
        selected.setEnabled(false);
        selected.setBackground(Color.darkGray);
        other.setEnabled(true);
        other.setBackground(Color.lightGray);
    }
}