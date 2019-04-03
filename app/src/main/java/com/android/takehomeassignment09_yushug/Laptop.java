package com.android.takehomeassignment09_yushug;

public class Laptop {
    private String brand;
    private int year;
    private double weightInKg;

    public Laptop(String brand, int year, double weightInKg) {
        this.brand = brand;
        this.year = year;
        this.weightInKg = weightInKg;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", weightInKg=" + weightInKg +
                '}';
    }
}
