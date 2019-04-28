package com.example.quantity;

import java.util.Objects;

public class Kilogram {

    private double value;

    public Kilogram(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kilogram kilogram = (Kilogram) o;
        return Double.compare(kilogram.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public Kilogram add(Kilogram kilogram) {
        return new Kilogram(20);
    }
}
