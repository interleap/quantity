package com.example.quantity;

public enum Unit {
    Kilogram(1000), Gram(1);

    private double scale;

    Unit(double scale) {
        this.scale = scale;
    }

    double toBaseUnit(double value) {
        return value * scale;
    }

    double fromBaseUnit(double value) {
        return value / scale;
    }
}
