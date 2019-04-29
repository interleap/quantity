package com.example.quantity;

import java.util.Objects;

import static java.lang.Math.abs;

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
        return areMagnitudesEqualInBaseUnit(weight);
    }

    private boolean areMagnitudesEqualInBaseUnit(Weight weight) {
        return equalToThousandthPlace(weight.unit.toBaseUnit(weight.value), unit.toBaseUnit(value));
    }

    private boolean equalToThousandthPlace(double firstValue, double secondValue) {
        return abs(firstValue - secondValue) < .001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public Weight add(Weight weight) {
        double valueInBaseUnit = unit.toBaseUnit(value) + weight.unit.toBaseUnit(weight.value);
        return new Weight(unit.fromBaseUnit(valueInBaseUnit), unit);
    }

}
