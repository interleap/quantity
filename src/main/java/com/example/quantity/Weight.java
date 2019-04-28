package com.example.quantity;

import java.util.Objects;

public class Weight {

    private double value;
    private Unit unit;

    public Weight(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Double.compare(weight.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public Weight add(Weight weight) {
        return new Weight(value + weight.value, Unit.Kilogram);
    }
}
