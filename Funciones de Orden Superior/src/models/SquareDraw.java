package models;

import interfaces.ShapeDraw;
import view.DrawingPanel;

import java.awt.Color;

public class SquareDraw {
    public static ShapeDraw draw() {
        return g -> {
            g.setColor(Color.GREEN);
            int side = 300;
            int x = (DrawingPanel.WIDTH - side) / 2;
            int y = (DrawingPanel.HEIGHT - side) / 2;
            g.fillRect(x, y, side, side);
        };
    }
}