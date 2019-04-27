package com.example.quantity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KilogramTest {

    @Test
    public void tenKilogramsShouldEqualAnother10Kilograms(){
        assertEquals(new Kilogram(10), new Kilogram(10));
    }


    @Test
    public void sevenKilogramsShouldNotEqualTenKilograms(){
        assertNotEquals(new Kilogram(10), new Kilogram(7));
    }

    @Test
    public void sevenKilogramsShouldNotEqualAString(){
        assertNotEquals(new Kilogram(10), "string");
    }

}