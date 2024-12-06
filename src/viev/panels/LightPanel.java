package viev.panels;

import java.awt.*;

public class LightPanel extends AbstractPanel {
    private boolean lightOn;
    private final ObjectColor lightColor;

    public LightPanel(ObjectColor lightColor) {
        this.lightColor = lightColor;
        this.lightOn = false;
        setColor(lightColor.off);
    }

    public void setLightOn(boolean lightOn) {
        this.lightOn = lightOn;
        setColor(lightOn ? lightColor.on : lightColor.off);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(50, 50, 100, 100);
    }
}
