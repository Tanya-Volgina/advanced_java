package org.example.Sweets;

public class Sweet {
    private String name;
    private double price;
    private double weight;

    public Sweet(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price + ", Weight: " + weight;
    }
}
