package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertEquals(12, rectangle.getArea());
    }

}