package com.example.quantity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KilogramTest {

    @Test
    public void tenKilogramsShouldEqualAnother10Kilograms(){
        assertEquals(new Kilogram(7), new Kilogram(7));
    }
    
}