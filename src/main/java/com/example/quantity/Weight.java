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
        return equalToThousandthPlace(toBaseUnit(weight.unit, weight.value), toBaseUnit(unit, value));
    }

    private boolean equalToThousandthPlace(double firstValue, double secondValue) {
        return abs(firstValue - secondValue) < .001;
    }

    private double toBaseUnit(Unit unit, double value) {
        return value * unit.scale;
    }

    private double fromBaseUnit(Unit unit, double value) {
        return value / unit.scale;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public Weight add(Weight weight) {
        double valueInBaseUnit = toBaseUnit(unit, value) + toBaseUnit(weight.unit, weight.value);
        return new Weight(fromBaseUnit(unit, valueInBaseUnit), unit);
    }

}
