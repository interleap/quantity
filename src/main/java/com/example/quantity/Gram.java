package com.example.quantity;

import java.util.Objects;

public class Gram{
    private double value;

    public Gram(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gram other = (Gram) o;
        return Double.compare(other.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public Gram add(Gram other) {
        return new Gram(value + other.value);
    }
}
