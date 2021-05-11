package com.company;

public class Main {
    public static void main(String[] args) {
        Perforator perforator1 = new Perforator(3000, 45, "PhilipX",
                "Black", "Sony", 1200, "ab350", 1000, 700, "USA", 250,
                "Medium");
        Perforator perforator2 = new Perforator(2000, 30, "iPerf",
                "Pink", "Apple", 500, "5s", 700, 800, "China", 150,
                "Medium");
        Perforator perforator3 = new Perforator(1000, 20, "Luxperf",
                "Blue", "Btech", 400, "AX5", 500, 900, "China", 150,
                "Large");
        System.out.println(perforator1);
        System.out.println("-----------------------------------------------------------------");
        System.out.println(perforator2);
        System.out.println("-----------------------------------------------------------------");
        System.out.println(perforator3);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Виведення статичного поля");
        perforator1.printCounter();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Виведення статичного поля статичним методом");
        Perforator.printStaticCounter();
    }
}
