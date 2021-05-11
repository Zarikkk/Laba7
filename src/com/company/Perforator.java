package com.company;

public class Perforator {
    int turnovers;
    int punches;
    String name;
    String color;
    String producer;
    private int power;
    private String model;
    private int price;
    private int weight;
    private String country;
    protected int consumption;
    protected String size;
    public static int counter;

    public void setValues(int turnovers, int punches, String name, String color, String producer,
                          int power, String model, int price, int weight, String country,
                          int consumption, String size) {
        this.turnovers = turnovers;
        this.punches = punches;
        this.name = name;
        this.color = color;
        this.producer = producer;
        this.power = power;
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.country = country;
        this.consumption = consumption;
        this.size = size;
    }

    public static void printStaticCounter() {
        System.out.println(Perforator.counter);
    }

    public void printCounter() {
        System.out.println(Perforator.counter);
    }

    public Perforator() {
        this(0, 0, null, null, null, 0,
                null, 0, 0, null, 0, null);
    }

    public Perforator(int power, String model, int price, int weight) {
        this(0, 0, null, null, null, power, model,
                price, weight, null, 0, null);
    }

    public Perforator(int turnovers, int punches, String name, String color, String producer,
                      int power, String model, int price, int weight, String country,
                      int consumption, String size) {
        setValues(turnovers, punches, name, color, producer, power,
                model, price, weight, country, consumption, size);
        counter++;
    }

    @Override
    public String toString() {
        return "Perforator turnovers -" + this.turnovers + "\npunches - " + this.punches
                + "\nname - " + this.name + "\ncolor - " + this.color
                + "\nproducer - " + this.producer + "\npower - "
                + this.power + "\nmodel - " + this.model
                + "\nprice" + this.price + "\nweight - " + this.weight
                + "\ncountry - " + this.country + "\nconsumption - " + this.consumption
                + "\nsize - " + this.size;
    }

}
