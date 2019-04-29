package com.example.quantity;

public enum Unit {
    Kilogram(1000), Gram(1);

    public double scale;

    Unit(double scale) {
        this.scale = scale;
    }
}
