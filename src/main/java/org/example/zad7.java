package org.example;

import javax.swing.*;
import java.awt.*;

public class zad7 extends JFrame {
    public zad7() {
        setTitle("Силуэт палатки");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setContentPane(new DrawingPanel());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            zad7 drawing = new zad7();
            drawing.setVisible(true);
        });
    }
}

class DrawingPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // палатка
        int[] xPointsTriangle = {width / 4 + 20, width / 2, 3 * width / 4 - 20};
        int[] yPointsTriangle = {height / 4, height / 8- 40, height / 4};
        g.setColor(Color.black);
        g.fillPolygon(xPointsTriangle, yPointsTriangle, 3);
        int squareSize = height / 4; // стена палатки
        int[] xPointsSquare = {width / 2, width / 2 + squareSize, width / 2 + squareSize + 40,  3 * width / 4 - 50};
        int[] yPointsSquare = {height / 8-40, 90,60,25};

        g.setColor(Color.darkGray);
        g.fillPolygon(xPointsSquare, yPointsSquare, 4);
        g.setColor(Color.black);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setStroke(new BasicStroke(5));
        int leftStickX = width / 4 - 15;
        g.drawLine(leftStickX, height / 4, leftStickX, height / 8);

        // Вертикальная палка справа от палатки
        int rightStickX = 3 * width / 4 + 60;
        g.drawLine(rightStickX, height / 4 -10, rightStickX, height / 8);

        g.fillOval(width / 4 - 25, height / 20, 20, 50);

        g.fillOval(3 * width / 4 + 40, height / 25, 40, 40);
        g2d.setStroke(new BasicStroke(3));


        int triangleHeight = height / 16; // Уменьшена высота
        g.drawLine(xPointsTriangle[0], yPointsTriangle[0], xPointsTriangle[0] - 10, yPointsTriangle[0] + triangleHeight);
        g.drawLine(xPointsTriangle[2], yPointsTriangle[2], xPointsTriangle[2] + 10, yPointsTriangle[2] + triangleHeight);
// Горизонтальная палка
        int horizontalStickY = 60; // Высота, на которой начинается горизонтальная палка
        int horizontalStickLength = height / 25; // Длина горизонтальной палки
        g.drawLine(width / 2 + squareSize + 40, horizontalStickY, width / 2 + squareSize + 40 + horizontalStickLength, horizontalStickY);

        int smallStickHeight = 10; // Высота маленьких палок
        g.drawLine(xPointsTriangle[0] - 10, yPointsTriangle[0] + triangleHeight, xPointsTriangle[0] - 10, yPointsTriangle[0] + triangleHeight - smallStickHeight);
        g.drawLine(xPointsTriangle[2] + 10, yPointsTriangle[2] + triangleHeight, xPointsTriangle[2] + 10, yPointsTriangle[2] + triangleHeight - smallStickHeight);
        int verticalStickX = width / 2 + squareSize + 40 + horizontalStickLength; // X-координата верхнего конца
        int verticalStickHeight = 10; // Высота вертикальной палки
        g.drawLine(verticalStickX, horizontalStickY, verticalStickX, horizontalStickY - verticalStickHeight);

    }
    }

//int[] yPointsSquare = {height / 8, height / 8, height / 8 - squareSize, height / 8 - squareSize};