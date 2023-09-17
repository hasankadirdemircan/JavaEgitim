package org.example;

public class Car {
    private String brand;
    private int year;
    private String model;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }
}
