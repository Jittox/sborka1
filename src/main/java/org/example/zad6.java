package org.example;

import java.io.IOException;

class Bird {
    void tofly() {
        System.out.println("Птица летит.");
    }

    void tosing() {
        System.out.println("Птица поет.");
    }
}

class Сuckoo extends Bird {
    void laysegg() throws IOException {

        throw new IOException("Ошибка ввода/вывода при несении яиц");
    }

    void hatchchicks() {
        System.out.println("Кукушка высиживает птенцов.");
    }
}

class Nasedka extends Сuckoo {
}

public class zad6 {
    public static void main(String[] args) {
        Nasedka nasedka1 = new Nasedka();

        try {
            nasedka1.tofly();
            nasedka1.tosing();
            nasedka1.laysegg();
            nasedka1.hatchchicks();
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода/вывода: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }
}