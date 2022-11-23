package org.example.Sweets;

public class Marmalade extends Sweet {
    private String compound;

    public Marmalade(String name, double price, double weight, String compound) {
        super(name, price, weight);
        this.compound = compound;
    }

    @Override
    public String toString() {
        return super.toString() + ", compound: " + compound;
    }
}
