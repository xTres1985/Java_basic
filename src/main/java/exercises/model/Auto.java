package exercises.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

// 1. Utwórz klasę auto w której zadeklaruje następujące pola
// -brand
// -model
// iengine {1.5, 1.9, 2.0, 3.0}
// fuel {diesel, gasoline}
// price
// 2. wykorzystaj model java beans
public class Auto {
    private String brand, model;
    private Engine engine;
    private Fuel fuel;
    private double price;
    private LocalDateTime dateAdded = LocalDateTime.now();

    public Auto(String brand, String model, Engine engine, Fuel fuel, double price) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto" +
                " | " + brand +
                " | " + model +
                " | " + engine +
                " | " + fuel +
                " | " + price + " |";
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
