package org.example.Sweets;

public class Chocolate extends Sweet {
    private String color;

    public Chocolate(String name, double price, double weight, String color) {
        super(name, price, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", color: " + color;
    }
}
