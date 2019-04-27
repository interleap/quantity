package com.example.quantity;

import java.util.Objects;

public class Kilogram {

    private double value;

    public Kilogram(double value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object other) {
        if(other == null || getClass() != other.getClass()) return false;
        Kilogram kilogram = (Kilogram) other;
        return this.value == kilogram.value;
    }
}
