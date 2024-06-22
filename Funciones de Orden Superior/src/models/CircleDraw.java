package models;

import interfaces.ShapeDraw;
import view.DrawingPanel;

import java.awt.Color;

public class CircleDraw {
    public static ShapeDraw draw() {
        return g -> {
            g.setColor(Color.RED);
            int radius = 300;
            int x = (DrawingPanel.WIDTH - radius) / 2;
            int y = (DrawingPanel.HEIGHT - radius) / 2;
            g.fillOval(x, y, radius, radius);
        };
    }
}