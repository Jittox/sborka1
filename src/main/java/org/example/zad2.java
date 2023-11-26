package org.example;

class Bus {
    String driverName;
    String busNumber;
    int routeNumber;
    String brand;
    int yearOfOperation;
    double mileage;

    public Bus(String driverName, String busNumber, int routeNumber, String brand, int yearOfOperation, double mileage) {
        this.driverName = driverName;
        this.busNumber = busNumber;
        this.routeNumber = routeNumber;
        this.brand = brand;
        this.yearOfOperation = yearOfOperation;
        this.mileage = mileage;
    }
}

public class zad2 {
    public static void main(String[] args) {
        //массив объектов Bus
        Bus[] buses = {
                new Bus("Паванов С.П.", "A123BC", 101, "Mercedes", 2018, 50000.0),
                new Bus("Петров П.П.", "B456CD", 102, "Volvo", 2019, 60000.0),
                new Bus("Сидоров С.С.", "C789DE", 101, "MAN", 2017, 70000.0),
                // Добавьте другие автобусы по необходимости
        };

        //список автобусов для заданного номера маршрута
        int targetRouteNumber = 101;
        System.out.println("Список автобусов для маршрута " + targetRouteNumber + ":");
        displayBusesByRoute(buses, targetRouteNumber);

        //список автобусов, которые эксплуатируются больше заданного срока
        int targetYearsOfOperation = 3; // например, более 3 лет
        System.out.println("\nСписок автобусов, эксплуатируемых более " + targetYearsOfOperation + " лет:");
        displayBusesByYearsOfOperation(buses, targetYearsOfOperation);

        //список автобусов с пробегом больше заданного расстояния
        double targetMileage = 60000.0; // например, более 60000 км
        System.out.println("\nСписок автобусов с пробегом более " + targetMileage + " км:");
        displayBusesByMileage(buses, targetMileage);
    }

    //для вывода списка автобусов для заданного номера маршрута
    private static void displayBusesByRoute(Bus[] buses, int routeNumber) {
        for (Bus bus : buses) {
            if (bus.routeNumber == routeNumber) {
                System.out.println(bus.driverName + " - " + bus.busNumber);
            }
        }
    }

    //для вывода списка автобусов, которые эксплуатируются больше заданного срока
    private static void displayBusesByYearsOfOperation(Bus[] buses, int years) {
        int currentYear = 2023; // Текущий год (можно заменить на получение текущего года из системы)
        for (Bus bus : buses) {
            if (currentYear - bus.yearOfOperation > years) {
                System.out.println(bus.driverName + " - " + bus.busNumber);
            }
        }
    }

    //для вывода списка автобусов с пробегом больше заданного расстояния
    private static void displayBusesByMileage(Bus[] buses, double mileage) {
        for (Bus bus : buses) {
            if (bus.mileage > mileage) {
                System.out.println(bus.driverName + " - " + bus.busNumber);
            }
        }
    }
}