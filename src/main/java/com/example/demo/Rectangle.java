package com.example.demo;

public class Rectangle {
    
    private int width;
    private int height;
    
    public Rectangle(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Side lengths must be positive");
        }
        if (width == 0) {
            throw new IllegalArgumentException("Width must be non-zero");
        }
        if (height == 0) {
            throw new IllegalArgumentException("Height must be non-zero");
        }
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be positive");
        }
        this.width = sideLength;
        this.height = sideLength;
    }
    
    public int getArea() {
        return width * height;
    }
    
    public int getPerimeter() {
        return 2 * (width + height);
    }
    
}
