package org.example;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность матрицы (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        fillMatrix(matrix, n);

        System.out.println("\nИсходная матрица:");
        printMatrix(matrix);

        int[][] rotated90Matrix = rotateMatrix(matrix, n, 1);
        int[][] rotated180Matrix = rotateMatrix(matrix, n, 2);
        int[][] rotated270Matrix = rotateMatrix(matrix, n, 3);

        System.out.println("\nМатрица после поворота на 90 градусов против часовой стрелки:");
        printMatrix(rotated90Matrix);

        System.out.println("\nМатрица после поворота на 180 градусов против часовой стрелки:");
        printMatrix(rotated180Matrix);

        System.out.println("\nМатрица после поворота на 270 градусов против часовой стрелки:");
        printMatrix(rotated270Matrix);
    }

    // Для заполнения матрицы случайными числами в интервале от -n до n
    private static void fillMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * (2 * n + 1)) - n;
            }
        }
    }

    // Для вывода матрицы в консоль
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Для поворота матрицы на указанное количество градусов против часовой стрелки
    private static int[][] rotateMatrix(int[][] matrix, int n, int degrees) {
        int[][] rotatedMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                switch (degrees) {
                    case 1:  // 90 градусов
                        rotatedMatrix[i][j] = matrix[j][n - 1 - i];
                        break;
                    case 2:  // 180 градусов
                        rotatedMatrix[i][j] = matrix[n - 1 - i][n - 1 - j];
                        break;
                    case 3:  // 270 градусов
                        rotatedMatrix[i][j] = matrix[n - 1 - j][i];
                        break;
                    default:
                        throw new IllegalArgumentException("Неподдерживаемое количество градусов");
                }
            }
        }

        return rotatedMatrix;
    }
}
