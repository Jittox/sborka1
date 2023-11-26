package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задачи: ");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                zad1.main(args);
                break;
            case 2:
                zad2.main(args);
                break;
            case 3:
                zad3.main(args);
                break;
            case 4:
                zad4.main(args);
                break;
                case 5:
                zad5.main(args);
                break;
                case 6:
                zad6.main(args);
                break;
                case 7:
                zad7.main(args);
                break;
            case 8:
                zad8.main(args);
                break;
            default:
                System.out.println("Такой задачи не существует.");
        }
    }
}
