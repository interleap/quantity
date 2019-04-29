package com.example.quantity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeightTest {

    @Test
    public void shouldEqualAnotherObjectOfSameTypeAndValue(){
        assertEquals(new Weight(10, Unit.Kilogram), new Weight(10, Unit.Kilogram));
    }


    @Test
    public void shouldNotEqualToAnotherWeightWithDifferentValueAndSameWeight(){
        assertNotEquals(new Weight(10, Unit.Gram), new Weight(7, Unit.Gram));
    }

    @Test
    public void shouldNotEqualAString(){
        assertNotEquals(new Weight(10, Unit.Kilogram), "string");
    }

    @Test
    public void shouldNotEqualNull(){
        assertNotEquals(new Weight(10, Unit.Gram), null);
    }

    @Test
    public void additionOfAnotherWeightWithSameTypeShouldProduceWeightWithSumOfValues(){
        assertEquals(new Weight(20, Unit.Gram), new Weight(15, Unit.Gram).add(new Weight(5, Unit.Gram)));
    }

    @Test
    public void additionOfMultipleKilogramObjectsShouldProduceSumOfValues(){
        assertEquals(new Weight(10, Unit.Kilogram), new Weight(2, Unit.Kilogram).add(new Weight(5, Unit.Kilogram)).add(new Weight(3, Unit.Kilogram)));
    }

    @Test
    public void shouldBeAbleToCompareWeightsOfDifferentUnits(){
        assertEquals(new Weight(10500, Unit.Gram), new Weight(10.5, Unit.Kilogram));
    }

    @Test
    public void shouldBeAbleToAddWeightsOfDifferentUnits(){
        assertEquals(new Weight(1800, Unit.Gram), new Weight(1.3, Unit.Kilogram).add(new Weight(500, Unit.Gram)));
    }
}