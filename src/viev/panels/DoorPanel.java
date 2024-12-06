package viev.panels;

import java.awt.*;

public class DoorPanel extends AbstractPanel {
    private boolean doorOpen;
    private final ObjectColor doorColor;

    public DoorPanel(ObjectColor doorColor) {
        this.doorColor = doorColor;
        this.doorOpen = true;
        setColor(doorColor.on);
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
        setColor(doorOpen ? doorColor.on : doorColor.off);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(50, 50, 150, 150);
        g.setColor(Color.black);
        g.drawRect(50, 50, 150, 150);
    }
}
