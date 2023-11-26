package org.example;

class Bird1 {
    void tofly() {
        System.out.println("Птица летит.");
    }

    void tosing() {
        System.out.println("Птица поет.");
    }
}


class Сuckoo1 extends Bird1 {
    void laysegg() {
        System.out.println("Кукушка несет яйца.");
    }

    void hatchchicks() {
        System.out.println("Кукушка высиживает птенцов.");
    }
}

class Nasedka1 extends Сuckoo1 {
}

public class zad3 {
    public static void main(String[] args) {
        Nasedka1 nasedka1 = new Nasedka1();

        nasedka1.tofly();
        nasedka1.tosing();
        nasedka1.laysegg();
        nasedka1.hatchchicks();
    }
}