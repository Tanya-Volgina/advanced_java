package org.example.Sweets;

public class Candy extends Sweet {
    private String type;

    public Candy(String name, double price, double weight, String type) {
        super(name, price, weight);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", type: " + type;
    }
}
