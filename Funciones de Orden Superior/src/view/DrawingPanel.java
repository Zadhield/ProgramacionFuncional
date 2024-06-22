package view;

import interfaces.ShapeDraw;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class DrawingPanel extends JPanel {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    private ShapeDraw shapeDraw;

    public DrawingPanel() {
        setPreferredSize(new java.awt.Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);  // Fondo negro
    }

    public void setShapeDrawer(ShapeDraw shapeDraw) {
        this.shapeDraw = shapeDraw;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (shapeDraw != null) {
            shapeDraw.draw(g);
        }
    }
}

