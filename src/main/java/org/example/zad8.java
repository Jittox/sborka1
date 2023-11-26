package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector3D subtract(Vector3D other) {
        return new Vector3D(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public double dotProduct(Vector3D other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public double cosineAngle(Vector3D other) {
        double dotProduct = this.dotProduct(other);
        double lengthProduct = this.length() * other.length();

        if (lengthProduct == 0) {
            return 0;
        }

        return dotProduct / lengthProduct;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}


    public class zad8 extends JFrame {
        private JTextField x1Field, y1Field, z1Field, x2Field, y2Field, z2Field;
        private JTextArea resultArea;

        public zad8() {
            setTitle("Калькулятор");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Создание компонентов
            JLabel vector1Label = new JLabel("Вектор 1:");
            x1Field = new JTextField(5);
            y1Field = new JTextField(5);
            z1Field = new JTextField(5);

            JLabel vector2Label = new JLabel("Вектор 2:");
            x2Field = new JTextField(5);
            y2Field = new JTextField(5);
            z2Field = new JTextField(5);

            JButton calculateButton = new JButton("Посчитать");
            resultArea = new JTextArea(10, 30);
            resultArea.setEditable(false);

            // Добавление обработчика событий для кнопки
            calculateButton.addActionListener(e -> calculateVectors());

            // Размещение компонентов на панели
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(4, 2));
            panel.add(vector1Label);
            panel.add(new JPanel()); // Пустая ячейка для выравнивания
            panel.add(new JLabel("x:"));
            panel.add(x1Field);
            panel.add(new JLabel("y:"));
            panel.add(y1Field);
            panel.add(new JLabel("z:"));
            panel.add(z1Field);
            panel.add(vector2Label);
            panel.add(new JPanel()); // Пустая ячейка для выравнивания
            panel.add(new JLabel("x:"));
            panel.add(x2Field);
            panel.add(new JLabel("y:"));
            panel.add(y2Field);
            panel.add(new JLabel("z:"));
            panel.add(z2Field);

            // Добавление компонентов на основное окно
            add(panel, BorderLayout.NORTH);
            add(calculateButton, BorderLayout.CENTER);
            add(new JScrollPane(resultArea), BorderLayout.SOUTH);
        }

        private void calculateVectors() {
            try {
                double x1 = Double.parseDouble(x1Field.getText());
                double y1 = Double.parseDouble(y1Field.getText());
                double z1 = Double.parseDouble(z1Field.getText());

                double x2 = Double.parseDouble(x2Field.getText());
                double y2 = Double.parseDouble(y2Field.getText());
                double z2 = Double.parseDouble(z2Field.getText());

                Vector3D vector1 = new Vector3D(x1, y1, z1);
                Vector3D vector2 = new Vector3D(x2, y2, z2);

                Vector3D sum = vector1.add(vector2);
                Vector3D difference = vector1.subtract(vector2);
                double dotProduct = vector1.dotProduct(vector2);
                double length = vector1.length();
                double cosineAngle = vector1.cosineAngle(vector2);

                // Вывод результатов
                resultArea.setText("Сумма векторов: " + sum.toString() + "\n"
                        + "Разность векторов: " + difference.toString() + "\n"
                        + "Скалярное произведение : " + dotProduct + "\n"
                        + "Длина вектора: " + length + "\n"
                        + "Косинус угла между векторами: " + cosineAngle);
            } catch (NumberFormatException ex) {
                resultArea.setText("Ошибка.");
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> new zad8().setVisible(true));
        }
    }
