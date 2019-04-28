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
        assertNotEquals(new Weight(10, Unit.Kilogram), null);
    }

    @Test
    public void additionOfAnotherKilogramObjectShouldProduceSumOfValues(){
        assertEquals(new Weight(20, Unit.Kilogram), new Weight(15, Unit.Kilogram).add(new Weight(5, Unit.Kilogram)));
    }

    @Test
    public void additionOfMultipleKilogramObjectsShouldProduceSumOfValues(){
        assertEquals(new Weight(10, Unit.Kilogram), new Weight(2, Unit.Kilogram).add(new Weight(5, Unit.Kilogram)).add(new Weight(3, Unit.Kilogram)));
    }


}