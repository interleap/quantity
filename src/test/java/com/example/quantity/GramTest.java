package com.example.quantity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GramTest {
    @Test
    public void shouldBeAbleToAddMultipleGrams(){
        assertEquals(new Gram(4), new Gram(1).add(new Gram(3)));
    }
}