package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertEquals(12, rectangle.getArea());
    }

    @Test
    public void testSquareArea() {
        Rectangle square = new Rectangle(5, 5);
        assertEquals(25, square.getArea());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSideLength() {
        Rectangle rectangle = new Rectangle(3, -4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroWidth() {
        Rectangle rectangle = new Rectangle(0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroHeight() {
        Rectangle rectangle = new Rectangle(3, 0);
    }

    @Test
    public void testAreaWithSides2And7() {
        Rectangle rectangle = new Rectangle(2, 7);
        assertEquals(14, rectangle.getArea());
    }

    @Test
    public void testPerimeterWithSides3And5() {
        Rectangle rectangle = new Rectangle(3, 5);
        assertEquals(16, rectangle.getPerimeter());
    }

    @Test
    public void testIsSquareWithSides2And7() {
        Rectangle rectangle = new Rectangle(2, 7);
        assertFalse(rectangle.isSquare());
    }

    @Test
    public void testIsLargerThan() {
        Rectangle rectangle1 = new Rectangle(5, 7);
        Rectangle rectangle2 = new Rectangle(2, 3);
        assertTrue(rectangle1.isLargerThan(rectangle2));
    }
}