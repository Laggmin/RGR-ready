package viev.panels;

import java.awt.*;

public enum ObjectColor {
    GARAGECOLOR(Color.orange, Color.white),
    LIGTCOLOR(Color.yellow, Color.gray);

    public final Color on;
    public final Color off;

    ObjectColor(Color on, Color off) {
        this.on = on;
        this.off = off;
    }
}