package com.example.quantity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KilogramTest {

    @Test
    public void shouldEqualAnotherKilogramObjectWithSameValue(){
        assertEquals(new Kilogram(10), new Kilogram(10));
    }


    @Test
    public void shuoldNotEqualAnotherKilogramObjectWithDifferentValue(){
        assertNotEquals(new Kilogram(10), new Kilogram(7));
    }

    @Test
    public void shouldNotEqualAString(){
        assertNotEquals(new Kilogram(10), "string");
    }

    @Test
    public void shouldNotEqualNull(){
        assertNotEquals(new Kilogram(10), null);
    }

    @Test
    public void additionOfAnotherKilogramObjectShouldProduceSumOfValues(){
        assertEquals(new Kilogram(20), new Kilogram(15).add(new Kilogram(5)));
    }

}