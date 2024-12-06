package viev;

import viev.panels.ControlPanel;
import viev.panels.DoorPanel;
import viev.panels.LightPanel;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(ControlPanel controlPanel, LightPanel lightPanel, DoorPanel doorPanel) {
        setTitle("Garage Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        setLayout(new GridLayout(1, 3));
        setResizable(false);

        add(lightPanel);
        add(controlPanel);
        add(doorPanel);

        setVisible(true);
    }
}
