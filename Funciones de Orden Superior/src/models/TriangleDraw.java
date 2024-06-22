package models;

import interfaces.ShapeDraw;
import view.DrawingPanel;

import java.awt.Color;

public class TriangleDraw {
    public static ShapeDraw draw() {
        return g -> {
            g.setColor(Color.BLUE);
            int halfWidth = 100; // Aumentamos el ancho a la mitad del triángulo
            int height = 200; // Aumentamos la altura
            int[] xPoints = {
                    DrawingPanel.WIDTH / 2,
                    DrawingPanel.WIDTH / 2 - halfWidth,
                    DrawingPanel.WIDTH / 2 + halfWidth
            };
            int[] yPoints = {
                    DrawingPanel.HEIGHT / 2 - height / 2,
                    DrawingPanel.HEIGHT / 2 + height / 2,
                    DrawingPanel.HEIGHT / 2 + height / 2
            };
            g.fillPolygon(xPoints, yPoints, 3);
        };
    }
}