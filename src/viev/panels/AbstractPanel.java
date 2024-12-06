package viev.panels;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractPanel extends JPanel {
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
    }
}
