package view;

import models.CircleDraw;
import models.SquareDraw;
import models.TriangleDraw;

import javax.swing.*;
import java.awt.*;

public class DrawingApp extends JFrame {

    private DrawingPanel drawingPanel;

    public DrawingApp() {
        // Configuración de la ventana principal
        setTitle("Dibujar Figuras");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel para dibujar
        drawingPanel = new DrawingPanel();

        // Panel de botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));
        buttonPanel.setPreferredSize(new Dimension(200, 600));

        // Crear botones y agregarles listeners
        JButton circleButton = new JButton("Círculo");
        circleButton.addActionListener(e -> drawingPanel.setShapeDrawer(CircleDraw.draw()));

        JButton triangleButton = new JButton("Triángulo");
        triangleButton.addActionListener(e -> drawingPanel.setShapeDrawer(TriangleDraw.draw()));

        JButton squareButton = new JButton("Cuadrado");
        squareButton.addActionListener(e -> drawingPanel.setShapeDrawer(SquareDraw.draw()));

        buttonPanel.add(triangleButton);
        buttonPanel.add(squareButton);
        buttonPanel.add(circleButton);

        // Crear el JSplitPane para dividir la ventana en dos partes
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, buttonPanel, drawingPanel);
        splitPane.setDividerLocation(200); // Establecer la posición del divisor

        add(splitPane, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);  // Centrar la ventana
    }

}